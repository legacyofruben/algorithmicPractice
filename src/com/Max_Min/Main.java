package com.Max_Min;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        int outs[] = new int[t];



        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }

        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int lim = j-(i-1);
            int aux[] = new int[lim];
            for(int x = 0; x < lim; x++,i++){
                aux[x]=width[i];
            }
            Arrays.sort(aux);
            outs[a0]=aux[0];
        }
        for (int o:outs) {
            System.out.println(o);
        }

        in.close();
    }

}
