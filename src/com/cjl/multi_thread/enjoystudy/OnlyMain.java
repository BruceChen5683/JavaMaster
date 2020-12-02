package com.cjl.multi_thread.enjoystudy;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * Java天生多线程
 */
public class OnlyMain {
    public static void main(String[] args) {
        //虚拟机线程管理的接口
//        ThreadMXBean threadMXBean = ManagementFactory.ErrorCode.CoregetThreadMXBean();
//        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
//        for (ThreadInfo threadInfo : threadInfos) {
//            System.out.println("threadName:"+threadInfo.getThreadName()+" : "+threadInfo.getThreadId());
//        }
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
