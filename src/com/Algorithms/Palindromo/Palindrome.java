package com.Algorithms.Palindromo;

public class Palindrome {

    public static String toLower(char c){
        return String.valueOf(c).toLowerCase();
    }
    public static boolean isChar(char c){
        if(c >= 65 && c <= 90 || c >= 97 && c <= 122)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //String p = "a ni Ta lava l a    tiNA";
        String p = "a ni Taa lava l a    tiNA";

        char[] array = p.toCharArray();

        for (int i=0, j=p.length()-1; i<p.length()/2 ; i++,j--) {
            if(isChar(array[i])){
                if(isChar(array[j])){
                    if(!toLower(array[i]).equals(toLower(array[j]))){
                        System.out.println(array[i] + " " + array[j]);
                        System.out.println("Not palindrome");
                        break;
                    }
                }else{
                    --i;
                }
            }else{
                ++j;
                continue;
            }
        }
        System.out.println("Palindrome");
        /*
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = p.length()-1; i >= 0; i--) {
            if(p.charAt(i) >= 65 && p.charAt(i) <= 90 || p.charAt(i) >= 97 && p.charAt(i) <= 122){
                str1.append(String.valueOf(p.charAt(i)).toLowerCase());
                System.out.print(String.valueOf(p.charAt(i)).toLowerCase());
            }
        }
        str2 = str1;
        System.out.println();
        System.out.println(str2);
        System.out.println((str1.toString().equals(str2.reverse().toString()))?"true":"false");*/
    }
}
