package com.Algorithms.Roads_Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }

        boolean[] map = new boolean[n];
        int value=0;

        // Getting city's index and creating the map
        for (int i=0;i<c.length;i++){
            value=c[i];
            for (int a=0;a<map.length;a++) {
                if(a==value){
                    map[a]=true;
                }
            }
        }
        int index=0;
        for (int l=map.length-1;l>=0;l--){
            if(map[l]==true && l!=(map.length-1)){
                index=l;
                break;
            }
        }

        System.out.println(getMinDistance(map,index));

        }

    public static int getMinDistance(boolean[] array,int last) {
        int cleft=0;
        int cright=0;
        int index=0;
        boolean max=false;
        int lastIndex=last;
        int[] dis = new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            //if(i==13)
                //System.out.println();
            if(array[i]==true && (i==0 || i==array.length-1)){
                    cleft=0;
                    cright=0;
                    dis[index]=0;
                    index++;
                    continue;
            }else{
                if(array[i]==false){
                    for(int l=i;l>=0;l--){
                        if(array[l]==false){
                            cleft++;
                        }else{
                            break;
                        }
                    }
                    for(int r=i;r<=array.length-1;r++){
                        if(array[r]==false){
                            cright++;
                        }else{
                            break;
                        }
                    }
                    if(i==0 && array[i]==false){
                        max=true;
                    }else{
                        if(i>last && last!=array.length-1 && Math.max(cleft,cright)==cleft && array[array.length-1]== false){
                            max=(cleft>cright)?true:false;
                        }
                    }
                    if(max==true){
                        dis[index]=Math.max(cleft,cright);
                    }else {
                        dis[index]=Math.min(cleft,cright);
                    }
                    index++;
                    cleft=0;
                    cright=0;
                    max=false;
                }else{
                    dis[index]=Math.min(cleft,cright);
                    index++;
                    cleft=0;
                    cright=0;
                    continue;
                }
            }
        }

        Arrays.sort(dis);
        return dis[dis.length-1];
    }

    /*public static int getMinDistance(boolean[] array) {
        int cleft=0;
        int cright=0;
        int index=0;
        int pivote=0;
        int[] dis = new int[array.length];
        for (int i=0;i<array.length-1;i++)
        {

            for(int left=i;left>=0;left--)
            {
                if(array[left]==false){
                    cleft++;
                }else{
                    if(array[i]==true){
                        break;
                    }else{
                        pivote=i;
                    }
                }
            }
            for(int right=pivote;right<=(array.length-1) ;right++)
            {
                if(array[right]==false){
                    cright++;
                }else{
                    if(array[right]==true){
                        break;
                    }
                }
            }
            dis[index]=Math.min(cleft,cright);
            index++;
            cleft=0;
            cright=0;
        }

        Arrays.sort(dis);
        return dis[dis.length-1];
    }*/
}