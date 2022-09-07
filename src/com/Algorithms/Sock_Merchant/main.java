package com.Algorithms.Sock_Merchant;

import java.util.Arrays;

class main {

    private static int count = 0;



    public static void main (String[] args)
    {
        int[] array = new int[]{10,20,20,10,10,30,50,10,20} ;
        System.out.println(sockMerchant(9,array));
    }

    public static int sockMerchant(int n, int[] ar) {
        int aux;
        int count = 0;
        int result = 0;
        Arrays.sort(ar);
        for(int i = 0; i < n ; i++)
        {
            aux = ar[i];
            for(int j = i; j < n; j++){
                if(aux == ar[j]){
                    count++;
                }
            }
            if(count > 0)
            {
                result = result + (count / 2);
                i = i + count - 1;
            }
            count = 0;
        }

        return result;
    }
}
