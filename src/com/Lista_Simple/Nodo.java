package com.Lista_Simple;

public class Nodo {
    int value;
    Nodo next;

    public Nodo(int value, Nodo next){
        this.value = value;
        this.next = next;
    }

    public Nodo getNext(){
        return next;
    }

    public boolean hasNext(){
        if(this.next != null){
            return true;
        }else{
            return false;
        }
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setNodo( Nodo n){
        this.next = n;
    }
}
