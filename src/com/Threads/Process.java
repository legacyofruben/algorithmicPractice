package com.Threads;

/**
 * Created by ruben_cerpa on 20/06/17.
 */
public class Process extends Thread{

    public Process (String msg){
        super(msg);
    }

    public void run(){
        for (int i=0;i<200;i++){
            System.out.println("Process 1");
        }
    }
}
