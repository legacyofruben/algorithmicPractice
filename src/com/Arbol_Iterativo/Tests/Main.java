package com.Arbol_Iterativo.Tests;
import com.Arbol_Iterativo.Tests.Nodo;

/**
 * Created by ruben_cerpa on 2/08/17.
 */
public class Main {

    public static void main(String[] args){

        Arbol arbol = new Arbol();

        arbol.insert(new Nodo(3,"tres"));
        arbol.insert(new Nodo(1,"uno"));
        arbol.insert(new Nodo(5,"cinco"));

        arbol.inordenIterativo(arbol.raiz);

        /*
        BinTree arbol = new BinTree();

        arbol.insert(5,"Raiz");
        arbol.insert(3,"Izq");
        arbol.insert(7,"Der");

        arbol.inorden(arbol.raiz);
        */

    }
}
