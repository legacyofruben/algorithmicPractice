package com.Bubble_Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{2,7,1,5,0};
        bubbleSort(array);
        //Arrays.sort(array);
        for (int in:array) {
            System.out.print(in+" ");
        }


    }

    public static void bubbleSort(int[] arrayIn){

        int aux;
        boolean change = false;

        while (true){
            change = false;
            for(int i=1;i<arrayIn.length;i++){
                if(arrayIn[i]<arrayIn[i-1]){
                    aux = arrayIn[i];
                    arrayIn[i]=arrayIn[i-1];
                    arrayIn[i-1]=aux;
                    change = true;
                }
            }
            if(change==false){
                break;
            }
        }

    }


}
