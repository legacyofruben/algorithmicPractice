package com.Arbol;

import java.util.Stack;

public class Arbol {

    public Nodo raiz;

    public Arbol() {
    }


    public void insert (Nodo nodoInput){
        if( raiz ==  null){
            raiz = nodoInput;
        }else{
            Nodo temp = raiz;
            while (temp != null){
                nodoInput.padre = temp;
                if(nodoInput.key <= temp.key){
                    temp = temp.izq;
                }else{
                    temp = temp.der;
                }
            }

            if(nodoInput.key < nodoInput.padre.key ){
                nodoInput.padre.izq = nodoInput;
            }else{
                nodoInput.padre.der = nodoInput;
            }
        }
    }

    public void inOrden (Nodo nodo){
        if(nodo != null){
            inOrden(nodo.izq);
            printNodo(nodo);
            inOrden(nodo.der);
        }
    }
    public void inOrden_iterativo (Nodo nodo){
        Stack<Nodo> pila = new Stack<Nodo>();
        if(nodo != null){
            do {
                while (nodo != null) {
                    if (nodo != null) {
                        pila.push(nodo);
                        nodo = nodo.izq;

                    }
                }
                nodo = pila.pop();
                printNodo(nodo);

                if(nodo != null){
                    nodo = nodo.der;
                }

            }while (pila.size() > 0 || nodo != null );
        }
    }

    public void printNodo(Nodo n){
        System.out.println(n.key + "    " + n.value);
    }
}

class Nodo
{
    public Nodo padre;
    public Nodo izq;
    public Nodo der;
    public int key;
    public String value;

    public Nodo(int key, String value){
        this.padre = null;
        this.izq = null;
        this.der = null;
        this.key = key;
        this.value = value;
    }
}
