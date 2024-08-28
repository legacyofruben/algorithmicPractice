package com.Algorithms.SematicAnalyzer;

//import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

//import static javafx.application.Platform.exit;

/**
 * Created by ruben_cerpa on 10/07/17.
 */
public class Main {

    private static ArrayDeque<Character> pila = new ArrayDeque<Character>();
    private static char aux;

    public static void main (String[] args){

        Scanner in= new Scanner(System.in);

        String str = in.next();
        char [] input = str.toCharArray();
        for (char i:input) {
            pila.add(i);
        }

        inicio(pila.poll());

    }

    private static void inicio(char c) {
        if(c==(int)'{'){
            q0();
        }else {
            if(c==(int)'['){
                q1();
            }else{
                error();
            }
        }
    }

    private static void q0() {
        if(pila.size()!=0){
            aux = pila.poll();
        }else{
            result();
        }


        if(aux==(int)'['){
            q1();
        }else{
            if(aux==(int)'}'){
                q3();
            }
            else{
                error();
            }
        }
    }

    private static void q1() {
        if(pila.size()!=0){
            aux = pila.poll();
        }else{
            result();
        }


        if(aux==(int)']'){
            q2();
        }else{
            if(aux==(int)'{'){
                q0();
            }else{
                error();
            }
        }
    }

    private static void result() {
        System.out.println("Valid");
        System.exit(0);
    }


    private static void q2() {
        if(pila.size()!=0){
            aux = pila.poll();
        }else{
            result();
        }


        if(aux==(int)'}'){
            q3();
        }else{
            if(aux==(int)'{'){
                q1();
            }else{
                error();
            }
        }
    }
    private static void q3() {
        if(pila.size()>0){
            aux = pila.poll();
        }else{
            result();
        }


        if(aux==(int)'['){
            q1();
        }else{
            if(aux==(int)']'){
                q2();
            }else{
                error();
            }
        }
    }

    private static void error() {
        System.out.println("Invalid");
        System.exit(0);
    }


}
