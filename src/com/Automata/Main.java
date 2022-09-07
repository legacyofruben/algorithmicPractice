package com.Automata;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

    private static String input;
    private static char token;
    private static Queue<Character> pila = new LinkedList<Character>();

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert line: ");
        input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            pila.add(((char) input.charAt(i)));
        }

        if (input.length() < 2) {
            if(input.contains("{") || input.contains("("))
            {
                error();
            }else{
                start();
            }
        }else{
            start();
        }

    }

    public static void start (){
        if(input.length() == 0){
            error();
        }else
        {
            token = pila.remove();
            //input = input.substring(1);

            if(token == '{'){
                method1();
            }else
            {
                if(token == '('){
                    method2();
                }else{
                    if((token >= 65) && (token <= 122)){
                        method5();
                    }
                }
            }
        }
    }

    public static void method1 (){
        if(pila.size() == 0){
            error();
        }else{
            token = pila.remove();
            //input = input.substring(1);
            if (token == '{') {
                method1();
            }else{
                if (token == '}') {
                    method3();
                }else{
                    if (token == '(') {
                        method2();
                    }else{
                        if((token >= 65) && (token <= 122)){
                            method5();
                        }
                    }
                }
            }
        }
    }
    public static void method2 (){
        if(pila.size() == 0){
            error();
        }else
        {
            token = pila.remove();
            //input = input.substring(1);
            if (token == '(') {
                method2();
            }else{
                if (token == ')') {
                    method4();
                }else{
                    if (token == '{') {
                        method1();
                    }else{
                        if((token >= 65) && (token <= 122)){
                            method5();
                        }
                    }
                }
            }
        }
    }
    public static void method3 (){
        if(pila.size() == 0){
            System.out.println("Success !!!");
        }else{
            token = pila.remove();
            //input = input.substring(1);
            if (token == '}') {
                method3();
            }else{
                if (token == ')') {
                    method2();
                }
            }
        }
    }
    public static void method4 (){
        if(pila.size() == 0){
            System.out.println("Success !!!");
        }else{
            token = pila.remove();
            //input = input.substring(1);
            if (token == '}') {
                method3();
            }else{
                if (token == ')') {
                    method4();
                }else{
                    if((token >= 65) && (token <= 122)){
                        method5();
                    }
                }
            }
        }
    }
    public static void method5 (){
        if(pila.size() == 0){
            error();
        }else{
            token = pila.remove();
            //input = input.substring(1);
            if((token >= 65) && (token <= 122)){
                method5();
            }else{
                if (token == '{') {
                    method1();
                }else{
                    if(token == '}'){
                        method3();
                    }else{
                        if (token == '(') {
                            method2();
                        }else{
                            if (token == ')') {
                                method4();
                            }
                        }
                    }
                }
            }
        }
    }

    public static void error (){
        System.out.println("Error !!!");
    }
}
