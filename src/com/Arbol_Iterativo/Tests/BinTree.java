package com.Arbol_Iterativo.Tests;


/**
 * Created by ruben_cerpa on 2/08/17.
 */
public class BinTree {

    public Nodo raiz;

    public void insert (int k, Object value){
        Nodo node = new Nodo(k);
        node.value = value;

        if (raiz == null) {     // Si la raiz esta vacia se inserta como el primer elemento
            raiz = node;
        }else{
            Nodo temp = raiz;   //  Se crea un temporal para mantener el arbol
            while(temp != null){    // Se recorre las ramas mientras no se llege a un null
                node.p = temp;      //  Se convierte el temporal en el padre de nodo a insertar
                if(node.key >= temp.key){      // Se evalua si la llave es mayor o igual para mandarlo hacia la derecha
                    temp = temp.der;            // Se asigna todo el sub-arbol derecho al temporal
                }else{                          // SI es menor se manda a la izquierda
                    temp = temp.izq;            // Se asigna todo el sub-arbol izquierdo al temporal
                }
            }

            if(node.key < node.p.key){          // Si la llave del nodo a insertar es menor a la llave del padre del mismo nodo
                node.p.izq = node;              //  el nodo a insertar se convierte en el nodo izq
            }else{
                node.p.der = node;              // Sino de lo contrario de convierte en el node derecho del padre
            }
        }
    }

    public void inorden(Nodo n){
        if(n!=null){
            inorden(n.izq);
            System.out.println("Key: "+n.key);
            System.out.println("Value: "+n.value);
            inorden(n.der);
        }
    }

    // Inner class
    class Nodo{
        Nodo p;
        Nodo izq;
        Nodo der;
        int key;
        Object value;

        public Nodo(int key) {
            this.key = key;
            this.der = null;
            this.izq = null;
            this.p = null;
            this.value = null;
        }
    }
}
