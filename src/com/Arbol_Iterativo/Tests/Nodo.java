package com.Arbol_Iterativo.Tests;

/**
 * Created by LEGACY on 13/03/2018.
 */
public class Nodo {

    public Nodo padre;
    public Nodo izq;
    public Nodo der;
    public int key;
    public String value;

    public Nodo (int key, String value)
    {
        this.padre = null;
        this.izq = null;
        this.der = null;
        this.key = key;
        this.value = value;
    }
}
