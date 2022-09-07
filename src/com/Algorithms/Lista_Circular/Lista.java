package com.Algorithms.Lista_Circular;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by LEGACY on 03/04/2019.
 */
public class Lista {

    private List lista = new ArrayList<item>();

    public void addItem(int index,int value)
    {
        lista.add(new item(index,value));
    }

    public int getValue(int index){
        Iterator itr = lista.iterator();
        while(itr.hasNext()){
            item i = (item) itr.next();
            if(i.index == index ){
                return i.value;
            }
        }
        return 0;
    }
}
class item{
    int index;
    int value;
    public item(int index, int value){
        this.index = index;
        this.value = value;
    }
}
