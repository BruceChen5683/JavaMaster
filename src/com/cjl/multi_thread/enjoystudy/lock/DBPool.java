package com.cjl.multi_thread.enjoystudy.lock;

import java.sql.Connection;
import java.util.LinkedList;

public class DBPool {
    private static LinkedList<Connection> pool = new LinkedList<>();

    public DBPool(int initialSize){
        if (initialSize > 0){
            for (int i = 0; i < initialSize; i++) {
                pool.addLast(SqlConnectImpl.getConnection());
            }
        }else{
            new DBPool(10);
        }
    }

    public Connection fetchConn(long mills) throws InterruptedException{
        synchronized (pool){
            if (mills < 0){
                while (pool.isEmpty()){
                    pool.wait();
                }
                return pool.removeFirst();
            }else{
                long overtime = mills + System.currentTimeMillis();
                long remain = mills;
                while (pool.isEmpty() && remain > 0){
                    pool.wait(remain);
                    remain = overtime - System.currentTimeMillis();
                }
                if (!pool.isEmpty()){
                    return pool.removeFirst();
                }else {
                    return null;
                }
            }
        }
    }

    public void releaseConn(Connection connection){
        if (connection != null){
            synchronized (pool){
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

}
