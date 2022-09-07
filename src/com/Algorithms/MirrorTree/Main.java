package com.Algorithms.MirrorTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by ruben_cerpa on 10/07/17.
 */
public class Main {

    public static void main (String[] args) {

        //Scanner in = new Scanner(System.in);
        BinaryTree arbol = new BinaryTree();
        arbol.insertar(5, null);
        arbol.insertar(2, null);
        arbol.insertar(3, null);
        arbol.insertar(1, null);
        arbol.insertar(7, null);
        arbol.insertar(6, null);
        arbol.insertar(8, null);

        arbol.modificarInorden(arbol.raiz);

        //arbol.recorridoInorden(arbol.raiz);

        arbol.isMirror(arbol.getTrees(arbol.raiz).get(0).raiz,arbol.getTrees(arbol.raiz).get(1).raiz);





    }


}
