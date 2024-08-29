package com.Threads;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Main {

    public static void main(String[] args) {
        Thread t = new Process("Process 1");
        t.start();
        ProcessRun t2 = new ProcessRun();
        t2.run();
    }
}
