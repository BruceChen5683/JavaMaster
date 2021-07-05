package com.cjl.multi_thread.enjoystudy;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Java天生多线程
 */
public class OnlyMain {

    public static Map<String,String> map = new HashMap<>();
    public static void main(String[] args) throws Exception {
        //虚拟机线程管理的接口
//        ThreadMXBean threadMXBean = ManagementFactory.ErrorCode.CoregetThreadMXBean();
//        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
//        for (ThreadInfo threadInfo : threadInfos) {
//            System.out.println("threadName:"+threadInfo.getThreadName()+" : "+threadInfo.getThreadId());
//        }


        map.put("a","b");

        Class<?>  clz = OnlyMain.class;
        Field field = clz.getDeclaredField("map");
        field.set(null,null);

        System.out.println(map);

    }
}
//输出
/**
 *  Idea 特有的线程 忽略  Monitor Ctrl-Break
 * */
//threadName:Monitor Ctrl-Break : 6



//        threadName:Attach Listener : 5
//        threadName:Signal Dispatcher : 4
//        threadName:Finalizer : 3
//        threadName:Reference Handler : 2
//        threadName:main : 1
