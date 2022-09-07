package com.Quick_Sort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{3,2,7,1,5,0};

        //Arrays.sort(array);
        for (int in:quickSort(array)) {
            System.out.print(in+" ");
        }


    }

    public static int[] quickSort(int[] arrayIn){

        return quickSort1(arrayIn);
    }

    public static int [] quickSort1(int[] elements){

        return quickSort2(elements,0,elements.length-1);
    }

    public static int [] quickSort2(int[] elements,int izq, int der){

        if(izq>=der){
            return elements;
        }
        int i = izq;
        int d =der;
        if(izq != der){
            int pivote;
            int aux;
            pivote = izq;
            while(izq != der){
                while (elements[der] >= elements[pivote] && izq < der){
                    der--;
                    while (elements[izq] < elements[pivote] && izq < der){
                        izq++;
                    }
                }
                if(der != izq){
                    aux = elements[der];
                    elements[der] = elements[izq];
                    elements[izq] = aux;
                }
                if(der == izq){
                    quickSort2(elements,i,izq-1);
                    quickSort2(elements,izq+1,d);
                }
            }
        }else{
            return elements;
        }

        return elements;
    }


}
