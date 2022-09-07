package com.Algorithms.Static_Initializer_Block;

import java.util.Scanner;

public class main {
    public static Scanner in = new Scanner(System.in);
    public static int B ;//in.nextInt();
    public static int H ;//in.nextInt();
    public static boolean flag;
    static {
        if(initialize() == false){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag =  false;
        }else{
            flag = true;
        }
    }

    public static boolean initialize() {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        if(B <= 0 || H <= 0 ){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
