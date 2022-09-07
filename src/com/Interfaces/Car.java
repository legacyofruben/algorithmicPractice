package com.Interfaces;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Car implements Wheel{

    public Car() {
    }

    @Override
    public void run() {
        System.out.println("The car is running.");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped.");
    }
}
