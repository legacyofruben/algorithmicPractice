package com.Algorithms.Anagram;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count = 0;
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        for(int i=0;i<str1.length;i++){
            for(int j=0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    str1[i]='#';
                    str2[j]='#';
                }
            }
        }
        //System.out.println(str1);
        //System.out.println(str2);
        for(char c:str1){
            if(c != '#'){
                count++;
            }
        }
        for(char c:str2){
            if(c != '#'){
                count++;
            }
        }
        return count;
    }

    // Second option
    static boolean isAnAnagram(String a, String b) {
        StringBuilder sb_b = new StringBuilder(b);
        for (int i = 0; i < a.length(); i++) {
            if(sb_b.indexOf(String.valueOf(a.charAt(i))) > -1){
                sb_b.deleteCharAt(sb_b.indexOf(String.valueOf(a.charAt(i))));
            }
        }
        return sb_b.length() == 0 ? true : false;
    }

    // Third option
    static boolean isAnAnagram2(String a, String b) {
        int length = b.length();
        for (int i = 0; i < a.length(); i++) {
            if(b.lastIndexOf(a.charAt(i)) > -1){
                length--;
            }
        }
        return length == 0 ? true : false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String a = scanner.nextLine();
        //String b = scanner.nextLine();

//        String a = "nacionalista";
//        String b = "altisonancia";

        String a = "roma";
        String b = "moraa";

        int res = makeAnagram(a, b);

        System.out.println(String.valueOf(res));
        System.out.println("Second Anagram: ");
        System.out.println(isAnagram(a,b));
//        System.out.println("New Implementation Anagram: ");
//        System.out.println(isAnAnagram(a,b));
        System.out.println("New Implementation Anagram: ");
        System.out.println(isAnAnagram2(a,b));

        scanner.close();
    }

    static boolean isAnagram(String a, String b) {
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return (String.valueOf(str1).equals(String.valueOf(str2))?true:false);
    }
}
