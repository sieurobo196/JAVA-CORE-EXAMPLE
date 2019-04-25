package com.codewr.javacore.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecute {

    private static final int CORE_POOL_SIZE = 5000; //size init of thread pool
    private static final int MAX_POOL_SIZE = 10000; //max size of thread pool
    private static final int KEEP_ALIVE_TIME = 30; //time alive
    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;
    private static final int BLOCKING_QUEUE_SIZE = 5000; //size of queue

    public static ThreadPoolExecutor executor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TIME_UNIT,
            new ArrayBlockingQueue<Runnable>(BLOCKING_QUEUE_SIZE));

    private ThreadPoolExecute() {
    }

    private static class Loader {

        private static final ThreadPool INSTANCE = new ThreadPool();
    }

    public static ThreadPool getInstance() {
        return Loader.INSTANCE;
    }

    public static void add(Runnable r) {
        executor.execute(r);
    }

    public static void stop() {
        executor.shutdown();
    }

}
