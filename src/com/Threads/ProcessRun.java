package com.Threads;

/**
 * Created by ruben_cerpa on 20/06/17.
 */
public class ProcessRun implements Runnable {

    Thread t;   // TODO Thread to process

    public ProcessRun() {
        t = new Thread(this,"Thread 1");
        t.run();
    }

    public void run() {

        for(int i=0;i<200;i++){
            System.out.println("Thread 1");
        }
    }
}
