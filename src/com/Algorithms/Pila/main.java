package com.Algorithms.Pila;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by LEGACY on 13/02/2019.
 */
public class main {


   // private static Stack pila = new Stack<Character>();
    //private static ArrayList array = new ArrayList<Character>();

    public static void main(String[] args){

        //char[] input = new char[]{'{','(','[',']',')','}'};
        char[] input = new char[]{'{','}','[',']','(',')'};
        int half = 0;
        boolean r = true;


        if(input.length % 2 == 0){
            half = (input.length / 2);

            for (int i = 0; i < half; i++) {
                if(getPair(input[i]) != input[input.length - 1 - i])
                {
                    r = false;
                    break;
                }
            }

            System.out.println(r);


        }else{
            System.out.println(false);
        }


    }

    public static char getPair(char c){

        if(c == '('){
            return ')';
        }else{
            if(c == '{'){
                return '}';
            }else
            {
                return ']';
            }
        }
    }
}
