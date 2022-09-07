package com.Algorithms.company_Problem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Main sol = new Main();
        int n = in.nextInt();
        for (int j = 0; j < n; j++) {
            int bLenght = in.nextInt();
            int[] b = new int[bLenght];
            for (int i = 0; i < bLenght; i++) {
                b[i] = in.nextInt();
            }
            System.out.println(sol.solution(b));
        }
    }

    static long solution(int[] b) {
        int[][] dp = new int[b.length][2];
        for (int i = 1; i < b.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + Math.abs(b[i - 1] - 1));
            dp[i][1] = Math.max(dp[i - 1][0] + Math.abs(b[i] - 1), dp[i - 1][1]);
        }
        long result = Math.max(dp[b.length - 1][0], dp[b.length - 1][1]);
        return result;
    }
}
