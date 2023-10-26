package com.Matrix;

public class InvertPrinting {

    /**
     * Print the matrix in inverted order
     * ** invertedOrder **
     *  25 24 23 22 21
     *  20 19 18 17 16
     *  15 14 13 12 11
     *  10 9  8  7  6
     *  5  4  3  2  1
     *
     *  ** invertedZigZagOrder **
     *     25 24 23 22 21
     *     16 17 18 19 20
     *     15 14 13 12 11
     *     6  7  8  9  10
     *     5  4  3  2  1
     */

    static int[][] matrix = new int[5][5];
    public static void main(String[] args) {
        //invertedOrder();
        invertedZigZagOrder();
        print();
    }

    public static void invertedZigZagOrder(){
        int count = 1;
        boolean invert = true;
        for (int i = matrix.length -1; i >= 0; i--) {
            if(invert){
                for (int j = matrix[0].length-1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }else{
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = count++;
                }
            }
            invert = !invert;
        }
    }

    public static void invertedOrder(){
        int count = 1;
        for (int i = matrix.length-1; i >= 0; i--) {
            for (int j = matrix[0].length-1; j >= 0; j--) {
                matrix[i][j] = count++;
            }
        }
    }

    public static void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
