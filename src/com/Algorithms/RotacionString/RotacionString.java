package com.Algorithms.RotacionString;

public class RotacionString {

    public static void main(String[] args) {
/*        String str = "abcde";
        String input = "deabc";   */
        String str = "abcade";
        String input = "adeabc";
        System.out.println(isRotation(str,input));
        System.out.println(isRotation2(str,input));
    }

    public static boolean isRotation (String str, String input) {
        if(str.equals(input)) return true;
        StringBuilder stringBuilder = new StringBuilder();
        int index = input.indexOf(str.charAt(0));
        while(index != -1){
            stringBuilder.append(input.substring(index));
            stringBuilder.append(input.substring(0,index));
            if(str.equals(stringBuilder.toString())){
                return true;
            }else{
                index = input.indexOf(str.charAt(0),index+1);
                stringBuilder.delete(0,stringBuilder.length());
            }
        }

        return false;
    }

    public static boolean isRotation2(String str, String input){
        if((input+input).contains(str)){
            return true;
        }
        return false;
    }
}
