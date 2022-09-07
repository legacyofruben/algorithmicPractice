package com.Arbol_Iterativo.Tests;

import java.security.Key;
import java.util.Stack;

/**
 * Created by LEGACY on 13/03/2018.
 */
public class Arbol {

    // Class attributes

    public Nodo raiz;

    // Class Methods

    public void insert (Nodo inNodo){

        if(raiz == null)
        {
            raiz = inNodo;
        }else{
            Nodo temporal = raiz;
            while(temporal != null){
                inNodo.padre = temporal;
                if(inNodo.key >= temporal.key){
                    temporal = temporal.der;
                }else{
                    temporal = temporal.izq;
                }
            }

            if(inNodo.key < inNodo.padre.key){
                inNodo.padre.izq = inNodo;
            }else{
                inNodo.padre.der = inNodo;
            }
        }
    }

    public void inorden(Nodo n){
        if(n != null){
            inorden(n.izq);
            System.out.println(n.key);
            inorden(n.der);
        }
    }

    public void inordenIterativo(Nodo n){
        Stack<Nodo> pila = new Stack<Nodo>();
        do {
            while (n != null)
            {
                if(n != null){
                    pila.push(n);
                    n = n.izq;
                }
            }
            n = pila.pop();
            System.out.println(n.key);
            if(n != null){
                n = n.der;
            }

        }while (pila.size() > 0 || n != null);

    }
}
