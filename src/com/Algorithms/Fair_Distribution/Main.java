package com.Algorithms.Fair_Distribution;

import java.util.Scanner;

/**
 * Created by ruben_cerpa on 16/06/17.
 */
public class Main {

    private static int min=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }

        boolean stop = false;

        for(int i=0; stop==false; i++){
            if(i < B.length && (B[i] % 2 )>0){
                if(i==0){
                    B[i]+=1;
                    B[i+1]+=1;
                    min+=2;
                    continue;
                }else{
                    if((B[i-1] % 2 )>0){
                        B[i]+=1;
                        B[i-1]+=1;
                        min+=2;
                        continue;
                    }else{
                        if(B.length-2 > i){
                            B[i]+=1;
                            B[i+1]+=1;
                            min+=2;
                            continue;
                        }else{
                            if(i == B.length-1){
                                B[i]+=1;
                                B[i-1]+=1;
                                min+=2;
                                stop=finish(B);
                                if(stop==false){
                                    i=-1;
                                }
                                continue;
                            }/*else{
                                min = -1;
                                stop = true;
                            }*/

                        }
                    }
                }
            }else{
                if(i < B.length && (B[i] % 2 )==0){
                    continue;
                }else{
                    if(i < B.length && (B[i] % 2 )>0){
                        B[i]+=1;
                        B[i-1]+=1;
                        min+=2;
                        stop=finish(B);
                        if(stop==false){
                            i=-1;
                        }
                        continue;
                    }else{
                        stop=finish(B);
                        if(stop==false){
                            i=-1;
                        }
                        continue;
                    }
                }
            }

        }
        System.out.println((min>-1)?min:"NO");
    }
    public static boolean finish(int[] num){
        int aux;
        for (int b=0;b<num.length;b++) {
            aux=b+1;
            if(aux < num.length && (Math.max(num[b],num[aux])-Math.min(num[b],num[aux])==1)){
                min = -1;
                return true;
            }
            if(aux < num.length && b > 0){
                if((num[b-1] % 2 )==0){
                    if((num[b+1] % 2 )==0){
                        if((num[b] % 2 )>0){
                            min = -1;
                            return true;
                        }
                    }
                }

            }
            if((num[b] % 2 )>0){
                return false;
            }
        }
        return true;
    }
}
