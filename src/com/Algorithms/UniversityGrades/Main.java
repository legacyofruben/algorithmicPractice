package com.Algorithms.UniversityGrades;

import java.util.Scanner;

public class Main {

    private static int len;

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        len = scan.nextInt();
        int[] grades = new int[len];
        for (int i = 0; i < len; i++) {
            grades[i] = scan.nextInt();
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println(multipleOfFive(grades[i]));
        }
    }
    public static int multipleOfFive(int num){
        if(num >= 38){
            int aux = num;
            while ((aux % 5) != 0)
            {
                aux++;
            }
            if((aux - num) < 3){
                num = aux;
            }
        }
        return num;
    }
}
