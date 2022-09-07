package com.Algorithms.Jumping_on_the_Clouds;

 class main {

     // https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign&h_r=next-challenge&h_v=zen

     private static int jumps = 0;

     // Complete the jumpingOnClouds function below.
     public static int jumpingOnClouds(int[] c) {

         for (int i = 0; i < c.length; i++) {

             if ((i+2) < c.length) {

                 if (c[i+2] != 1) {
                     jumps++;
                     i+=1;
                     continue;
                 }
             }
             if ((i+1) < c.length) {

                 if (c[i + 1] != 1) {
                 }
             }

         }
         return jumps;
     }

     public static void main (String[] args){
         int[] array = new int[]{0,0,1,0,0,1,0};
         System.out.printf(String.valueOf(jumpingOnClouds(array)));
     }
}
