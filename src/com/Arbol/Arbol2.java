package com.Arbol;

import java.util.Stack;

/**
 * Created by LEGACY on 08/04/2020.
 */
public class Arbol2 {
    Node2 raiz;

    public Arbol2(){

    }

    void insert (Node2 nodeIn){
        if(raiz == null){
            raiz = nodeIn;
        }else{
            Node2 temp = raiz;
            while(temp != null){
                nodeIn.padre = temp;
                if(nodeIn.key <= temp.key){
                    temp = temp.izq;
                }else{
                    temp = temp.der;
                }
            }
            if(nodeIn.key < nodeIn.padre.key){
                nodeIn.padre.izq = nodeIn;
            }else{
                nodeIn.padre.der = nodeIn;
            }
        }
    }

    void inOrder(Node2 n){
        if(n != null){
            inOrder(n.izq);
            System.out.println("Key: "+ n.key + "  Value: " + n.value);
            inOrder(n.der);
        }
    }

    void inOrder_itera(Node2 n){
        Stack<Node2> pila = new Stack<Node2>();
        if(n != null){
            do{
                while(n != null){
                    if(n!=null)
                    {
                        pila.push(n);
                        n = n.izq;
                    }
                }
                n = pila.pop();
                System.out.println("Key: "+ n.key + "  Value: " + n.value);

                if(n != null){
                    n = n.der;
                }

            }while(pila.size() > 0 || n != null);
        }
    }
}
class Node2{
    Node2 padre;
    Node2 izq;
    Node2 der;
    int key;
    String value;

    Node2 (int k, String value){
        this.padre = null;
        this.izq = null;
        this.der = null;
        this.key=k;
        this.value=value;
    }
}