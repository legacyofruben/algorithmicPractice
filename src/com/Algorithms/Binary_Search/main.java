package com.Algorithms.Binary_Search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by LEGACY on 13/02/2019.
 */
public class main {

    //public static HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    public static Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();

    // Complete the whatFlavors function below.
   public static void whatFlavors(int[] cost, int money) {
       /*for (int i = 1; i <= cost.length; i++) {
           hm.put(i,cost[i]);
       }*/
       int[] arrayNoSort = cost.clone();
       int[] r = binarySearchToThisProblem(cost,money);
       r = getIndexs(arrayNoSort,r[0],r[1]);
       System.out.println(r[0] + " " + r[1]);
    }

    public static int[] binarySearchToThisProblem(int[] array, int x){
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        boolean flag = true;
        int[] result = new int[2];

        while(left <= right){
            //int mid = left  + ((right + left) / 2);
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                left = 0;
                right = mid - 1;
                while(flag){
                    if((array[left]+array[right]) == x){
                        result[0]=array[left];
                        result[1]=array[right];
                        flag = false;
                    }else{
                        if ((array[left]+array[right]) < x)
                        {
                            left++;
                        }else{
                            right--;
                        }
                    }
                }
                return result;
            }else{
                if(x < array[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }

        return result;
    }


    public static int[] getIndexs(int[] array,int i, int j){
        boolean flag = true;
        int[] pair = new int[2];
        int k = 1;
        while(flag){
            if(k == i){
                pair[0] = k;
            }
            if(k == j){
                pair[1] = k;
                flag = false;
            }
            k++;
        }

        return pair;

    }

    public static boolean binarySearch(int[] array, int x){
        int begin = 0;
        int end = array.length - 1;

        while(begin <= end){
            //int mid = left  + ((right + left) / 2);
            int mid = (begin + end) / 2;
            if (array[mid] == x) {
                return true;
            }else{
                if(x < array[mid]){
                    end = mid - 1;
                }else{
                    begin = mid + 1;
                }
            }
        }

        return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] cost = new int[]{1,4,5,3,2};
        whatFlavors(cost, 4);
        //whatFlavors(new int[]{2,2,4,3}, 4);
        /*
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }*/

    }
}
