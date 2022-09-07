package com.Lista_Simple;



public class List {
    public Nodo begin;
    public int count;

    public List(){
        begin = null;
        count = 0;
    }

    public boolean isEmpty(){
        return   this.begin == null;
    }

    public int getSize(){
        return this.count;
    }

    /*public void add (item value){
        if(this.isEmpty()){
            begin = new Nodo(value,null);
        }else{
            Nodo temp = this.begin;
            while(temp.getNext() != null)
            {
                temp = temp.getNext();
            }
            temp.setNodo(new Nodo(value,null));
            //this.begin = temp;
        }
        count++;
    }*/

    public void printList(){
        Nodo temp = this.begin;
        while(temp.next != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
            if (temp.next == null)
            {
                System.out.println(temp.value);
            }
        }
    }
}
