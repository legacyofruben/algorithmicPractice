package com.Insertion_Sort;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{3,2,7,1,5,0};
        insertionSort(array);
        //Arrays.sort(array);
        for (int in:array) {
            System.out.print(in+" ");
        }


    }

    public static void insertionSort(int[] arrayIn){

        int aux, cont1, cont2;
        for (cont1 = 1; cont1<arrayIn.length; cont1++){

            aux = arrayIn[cont1];
            for(cont2=cont1-1; cont2>=0 && arrayIn[cont2]>aux; cont2--){
                arrayIn[cont2+1]=arrayIn[cont2];
                arrayIn[cont2]=aux;
            }
        }


    }


}
