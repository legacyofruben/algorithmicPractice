package com.Interfaces;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Bicycle implements Wheel,Seat {

    public Bicycle() {
    }

    @Override
    public void run() {
        System.out.println("The bicycle is running.");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle stopped.");
    }

    @Override
    public void sitDown() {
        System.out.println("You can sit down in the bicycle.");
    }
}
