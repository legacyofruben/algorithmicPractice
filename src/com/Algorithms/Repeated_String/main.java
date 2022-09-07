package com.Algorithms.Repeated_String;

class main {



    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long divition = n/s.length();
        long rest = n%s.length();
        long count = 0;

        for (char c : s.toCharArray())
        {
            if (c == 'a') {
                count++;
            }
        }
        count = (count * divition);
        for (int i = 0; i < rest; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args){

        System.out.println(repeatedString("aba", 10));

    }
}
