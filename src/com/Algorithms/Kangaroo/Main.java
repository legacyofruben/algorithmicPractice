package com.Algorithms.Kangaroo;

import java.util.Scanner;

class Kangaroo {

    private static String result= "NO";
    private final static int intCapacity = 1_000_000_000;

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function

        if((x1 >= 0) && (x2 > x1) &&  (v1 <= 10_000) && (v2 <= 10_000) && (v2 < v1)){
            while((x1 <= intCapacity) && (x2 <= intCapacity)){
                if(x1 == x2){
                    result= "YES";
                    //System.out.println(x1);
                    break;
                }else{
                    x1+=v1;
                    x2+=v2;
                    continue;
                }
            }
        }

        return result;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
//        int x1 = in.nextInt();
//        int v1 = in.nextInt();
//        int x2 = in.nextInt();
//        int v2 = in.nextInt();
        String[] line = in.nextLine().split(" ");
        String result = kangaroo(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]));
        System.out.println(result);
    }
}
