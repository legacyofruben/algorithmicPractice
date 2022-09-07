package com.Algorithms.MirrorTree;

import java.util.ArrayList;

/**
 * Created by ruben_cerpa on 13/07/17.
 */
public class BinaryTree {

    Nodo raiz;

    public BinaryTree(){
        raiz = null;
    }

    public void recorridoInorden(Nodo x){

        if(x != null){
            recorridoInorden(x.izq);
            System.out.println(x.llave);
            recorridoInorden(x.der);
        }
    }

    public void insertar( int key, Object valor){

        Nodo n = new Nodo(key);
        n.valor = valor;

        if(raiz == null){
            raiz = n;
        }else{
            Nodo temporal = raiz;
            while(temporal != null){
                n.p = temporal;
                if(n.llave >= temporal.llave){
                    temporal = temporal.der;
                }else{
                    temporal = temporal.izq;
                }
            }

            if(n.llave < n.p.llave){
                n.p.izq = n;
            }else{
                n.p.der = n;
            }
        }
    }



    private class Nodo {
        public Nodo p;
        public Nodo der;
        public Nodo izq;
        public int llave;
        public Object valor;


        public Nodo(int key) {
            llave = key;
            der = null;

            izq = null;
            p = null;
            valor = null;
        }
    }

    /** @ Metodos para insertar NO ordenada
     *
     */
    public void modificarInorden(Nodo x){

        if(x != null){
            modificarInorden(x.izq);
            //System.out.println(x.llave);
            if(x.llave == 6){
                x.llave = 3;
            }else{
                if(x.llave == 7){
                    x.llave = 2;
                }else{
                    if(x.llave == 8){
                        x.llave = 1;
                    }
                }
            }
            modificarInorden(x.der);
        }
    }

    public ArrayList<BinaryTree> getTrees(Nodo n){
        ArrayList<BinaryTree> arrayList = new ArrayList<BinaryTree>();
        BinaryTree aux = new BinaryTree();
        aux.raiz = n.izq;
        arrayList.add(aux);
        aux.raiz = n.der;
        arrayList.add(aux);
        return arrayList;
    }

    public void isMirror(Nodo a1, Nodo a2){

        if(a1 != null && a2 != null){
            isMirror(a1.izq,a2.izq);
            if(a1.llave!=a2.llave){
                System.out.println("False");
            }
            isMirror(a1.der,a2.der);
        }
    }


}
