package ProjectEuler.LargestPalindromeProduct;


import java.util.Arrays;

public class LargestPalindromeProduct {

    static boolean isPalindrome(String input){
        int len = input.length();
        for (int i = 0, j = len-1; i < len/2; i++, j--) {
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static int solution() {
        int maxPalindrome = 0;

        // Iterate over all pairs of 3-digit numbers
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) { // Start from i to avoid redundant calculations
                int product = i * j;
                if (isPalindrome(String.valueOf(product)) && product > maxPalindrome) {
                    maxPalindrome = product;
                }
            }
        }

        return maxPalindrome;

    }
}
