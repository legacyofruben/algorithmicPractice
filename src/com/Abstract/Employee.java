package com.Abstract;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public abstract class Employee {

    private String type;

    public Employee(String type) {
        this.type = type;
    }


    public abstract void hasAccess();       // // Metodo abstracto

    public void getSalary(){
        System.out.println("Earn money each week.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
