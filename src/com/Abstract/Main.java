package com.Abstract;

public class Main {

    public static void main(String[] args) {

        Programmer p = new Programmer("Regular");
        Technical t = new Technical("Intern");

        p.hasAccess();
        System.out.println("The programmer is a "+p.getType()+" employee.");
        t.hasAccess();
        System.out.println("The technical is a "+t.getType()+" employee.");

    }

}
