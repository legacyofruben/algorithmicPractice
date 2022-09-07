package com.Algorithms.Sanmina_Test1;

/**
 * Created by LEGACY on 03/04/2019.
 */
public class main {

    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        for (int i = 100; i >= 0 ; i--) {
            if((i%3)==0){
                str.append("Fizz");
                if((i%5)==0){
                    str.append("Buzz");
                }
            }
            if(str.length()>0){
                System.out.print(i);
                System.out.println(str);
            }
            str.delete(0,str.length());
        }
    }
}
