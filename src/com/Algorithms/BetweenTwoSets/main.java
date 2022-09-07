package com.Algorithms.BetweenTwoSets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {


    static ArrayList<Integer> getNumbersFactors(int in)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=2; i<=in; i++){
            while(in%i==0){
                list.add(in);
                //System.out.println(i + "| " + n);
                //System.out.println(" -----");
                in = in/i;
            }
        }
        Collections.sort(list);

        return list;
    }
    static int getTotalX(int[] a, int[] b) {
        int count = 0;
        ArrayList<Integer> list = getNumbersFactors(b[0]);
        ArrayList<Integer> factors = new ArrayList<>();

        for (int l : list)
        {
            for(int am : a){
                if(l%am == 0){
                    if(!factors.contains(l)){
                        factors.add(l);
                    }
                }
            }
        }

        for (int f : factors)
        {
            for(int bm : b){
                if(bm%f == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(total);

//        bw.write(String.valueOf(total));
//        bw.newLine();
//
//        bw.close();
    }
}
