package com.Algorithms.IBM_Problem1;

import java.util.Arrays;

/**
 * Created by LEGACY on 04/04/2019.
 */
public class main {

    public static void main(String[] args){
        int index = 0;
        char[] input = "){][}(".toCharArray();
        Arrays.sort(input);
        StringBuilder str = new StringBuilder(String.valueOf(input));


        for (int i = 0; i < str.length();i++) {
            index = str.indexOf(String.valueOf(next(str.charAt(i))));
            if(index > -1)
            {
                if(index > i){
                    str.deleteCharAt(index);
                    str.deleteCharAt(i);
                }else{
                    str.deleteCharAt(i);
                    str.deleteCharAt(index);
                }
                i--;
            }
        }
        System.out.println((str.length() == 0 ? true:false));

        //System.out.println(process("){][}("));
    }

    public static char next (char c){

        if( c=='(' || c==')' ){
            return (c=='('?')':'(');
        }
        if( c=='[' || c==']' ){
            return (c=='['?']':'[');
        }
        if( c=='{' || c=='}' ){
            return (c=='{'?'}':'{');
        }
        return ' ';
    }

    // New implementation

    public static boolean process (String str){
        StringBuilder strb = new StringBuilder(str);
        int aux;
        for (int i = 0; i < str.length(); i++) {
            aux = strb.indexOf(String.valueOf(getPair(strb.charAt(i))));
            if(aux < i){
                strb.deleteCharAt(aux);
                strb.deleteCharAt(i);
            }else{
                strb.deleteCharAt(i);
                strb.deleteCharAt(aux);
            }
            i--;
        }

        return true;
    }

    public static char getPair(char c){
        char aux = 0;
        if(c=='(' || c==')'){
            aux = c == '(' ? ')' : '(';
        }
        if(c=='[' || c==']'){
            aux = c == '[' ? ']' : '[';
        }
        if( c=='{' || c=='}' ){
            aux = c =='{'?'}':'{';
        }
        return aux;
    }
}
