package com.Algorithms.isShorter;

public class main {

    static boolean isShorter(String input){
       int counter = 1;
       StringBuilder str = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(i < input.length()-1){
                if(input.charAt(i)==input.charAt(i+1)){
                    counter++;
                }else{
                    str.append(input.charAt(i)).append(counter);
                    counter=1;
                }
            }else{
                str.append(input.charAt(i)).append(counter);
            }
        }
        return str.length()<input.length();
    }
    public static void main(String[] args) {
        //String str = "ab";
        //String str = "aabbcccd";
        String str = "aaaabbccc";
        System.out.println(isShorter(str));
    }
}
