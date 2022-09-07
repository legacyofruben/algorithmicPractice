package com.Arbol;

import java.util.Random;

public class Main {

    public static void main (String[] args){

        long startTime ;
        long endTime ;
        int num = 0;

        Random rand = new Random();

        Arbol arbol = new Arbol();

//        for (int i = 0; i < 10000000; i++) {
//            num = rand.nextInt(10000000) + 0;
//            arbol.insert(new Nodo(num,String.valueOf(num)));
//        }

        /*
        arbol.insert(new Nodo(5,"CINCO"));
        arbol.insert(new Nodo(4,"CUATRO"));
        arbol.insert(new Nodo(7,"SIETE"));
        arbol.insert(new Nodo(2,"DOS"));
        arbol.insert(new Nodo(6,"SEIS"));
        arbol.insert(new Nodo(3,"TRES"));
        arbol.insert(new Nodo(1,"UNO"));
        */

        //startTime = System.currentTimeMillis();
        //arbol.inOrden(arbol.raiz);
        //arbol.inOrden_iterativo(arbol.raiz);
        //endTime = System.currentTimeMillis();
        //endTime = endTime - startTime;
        //System.out.println("Time: " + (endTime));

        Arbol2 arbol2 = new Arbol2();

        arbol2.insert(new Node2(3,"Tres"));
        arbol2.insert(new Node2(2,"Dos"));
        arbol2.insert(new Node2(4,"Cuatro"));
        arbol2.insert(new Node2(1,"Uno"));

        //arbol2.inOrder(arbol2.raiz);

        arbol2.inOrder_itera(arbol2.raiz);

    }
}
