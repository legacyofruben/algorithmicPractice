package com.Algorithms.SnailSort;


public class main {

    static void snailSort(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        snailSort(array);
    }
}
