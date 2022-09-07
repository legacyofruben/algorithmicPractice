package com.Algorithms.Cavity_Map;

import java.util.Scanner;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Main {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //int n = 4;//in.nextInt();
        StringBuilder str;
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        //String[] grid = new String[]{"1112", "1912", "1892", "1234"};
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        for(int a1=0;a1<n;a1++){
            for(int a2=0;a2<n;a2++){
                matrix[a1][a2]=Integer.parseInt(String.valueOf(grid[a1].charAt(a2)));
            }
        }



        if(n>2){
            for(int x = 1;x < n-1;x++){
                for(int z = 1;z < n-1;z++){
                    if(matrix[x][z] > matrix[x-1][z]){
                        if(matrix[x][z] > matrix[x][z-1]){
                            if((x+1) < n && matrix[x][z] > matrix[x+1][z]){
                                if((z+1) < n && matrix[x][z] > matrix[x][z+1]){
                                    matrix[x][z] = -1;
                                }
                            }
                        }
                    }
                }
            }

            for (int[] num:matrix) {
                for (int num2:num) {
                    System.out.print((num2==-1)?"X":num2);
                }
                System.out.println();
            }



        }else{
            for(int s=0;s<grid.length;s++){
                System.out.print(grid[s]+"\n");
            }

        }

    }

}
