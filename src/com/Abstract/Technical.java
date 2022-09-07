package com.Abstract;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Technical extends Employee {
    public Technical(String type) {
        super(type);
    }

    @Override
    public void hasAccess() {
        System.out.println("The technical has access to UDP's.");
    }
}
