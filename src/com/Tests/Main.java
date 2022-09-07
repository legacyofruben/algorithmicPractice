package com.Tests;

/**
 * Created by ruben_cerpa on 2/08/17.
 */
public class Main {

    public static void main(String[] args){

        BinTree arbol = new BinTree();

        arbol.insert(5,"Raiz");
        arbol.insert(3,"Izq");
        arbol.insert(7,"Der");

        arbol.inorden(arbol.raiz);

    }
}
