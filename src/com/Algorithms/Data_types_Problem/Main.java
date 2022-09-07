package com.Algorithms.Data_types_Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* Declare second integer, double, and String variables. */
        int _i = 0;
        double _d = 0;
        String _s = "";
        /* Read and save an integer, double, and String to your variables.*/
        _i = scan.nextInt();
        _d = scan.nextDouble();
        _s = (String) scan.next();
        _s = _s + scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+_i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+_d);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s.concat(_s));
        scan.close();
    }
}
