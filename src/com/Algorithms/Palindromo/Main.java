package com.Algorithms.Palindromo;

import java.util.Scanner;

/**
 * Created by ruben_cerpa on 10/07/17.
 */
public class Main {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        boolean result = true;

        String str = in.next();
        str = str.toLowerCase();
        for(int i=str.length()-1,j=0;i>=0;i--,j++)
        {
            if(str.charAt(j)==str.charAt(i)){
                continue;
            }else{
                result = false;
                break;
            }
        }
        System.out.println(result);

        /*FIRST OPTION*/
        /*
        String aux1 = "",aux2 = "";

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) != ' '){
                aux1 = aux1 + String.valueOf(str.charAt(i));
                aux2 = String.valueOf(str.charAt(i)) + aux2;
            }
        }
        System.out.println((aux1.equals(aux2)?"True":"False"));*/
    }

}
