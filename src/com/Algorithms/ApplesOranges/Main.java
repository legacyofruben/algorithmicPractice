package com.Algorithms.ApplesOranges;

import java.util.Scanner;

public class Main {

    /*
     * Complete the countApplesAndOranges function below.
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appl = 0;
        int oran = 0;
        int aux = 0;

        // Apples
        for (int i = 0; i < apples.length; i++) {
            aux = apples[i] + a;
            if( aux > a){
                if(aux >= s && aux <= t){
                    appl++;
                }else
                {
                    continue;
                }
            }else
            {
                continue;
            }
        }

        // Oranges
        for (int i = 0; i < oranges.length; i++) {
            aux = oranges[i] + b;
            if(aux < b){
                if(aux >= s && aux <= t){
                    oran++;
                }else
                {
                    continue;
                }
            }else
            {
                continue;
            }
        }

        System.out.println(appl);
        System.out.println(oran);



    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scan.nextLine().split(" ");

        int s = Integer.parseInt(st[0].trim());

        int t = Integer.parseInt(st[1].trim());

        String[] ab = scan.nextLine().split(" ");

        int a = Integer.parseInt(ab[0].trim());

        int b = Integer.parseInt(ab[1].trim());

        String[] mn = scan.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        int[] apple = new int[m];

        String[] appleItems = scan.nextLine().split(" ");

        for (int appleItr = 0; appleItr < m; appleItr++) {
            int appleItem = Integer.parseInt(appleItems[appleItr].trim());
            apple[appleItr] = appleItem;
        }

        int[] orange = new int[n];

        String[] orangeItems = scan.nextLine().split(" ");

        for (int orangeItr = 0; orangeItr < n; orangeItr++) {
            int orangeItem = Integer.parseInt(orangeItems[orangeItr].trim());
            orange[orangeItr] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);
    }
}
