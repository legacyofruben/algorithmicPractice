package com.Abstract;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Programmer extends Employee{


    public Programmer(String type) {
        super(type);
    }

    @Override
    public void hasAccess() {
        System.out.println("The programmer has access to the offices.");
    }
}
