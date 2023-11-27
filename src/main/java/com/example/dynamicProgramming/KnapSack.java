package com.example.dynamicProgramming;

public class KnapSack {
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int knapSack1(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack1(W, wt, val, n - 1);

        else
            return max(val[n - 1]
                    + knapSack1(W - wt[n - 1], wt,
                            val, n - 1),
                    knapSack1(W, wt, val, n - 1));
    }

    // Returns the value of maximum profit
    public int knapSackRec(int W, int wt[], int val[],
            int n, int[][] dp) {

        // Base condition
        if (n == 0 || W == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] > W)

            // Store the value of function call
            // stack in table before return
            return dp[n][W] = knapSackRec(W, wt, val, n - 1, dp);

        else

            // Return value of table after storing
            return dp[n][W] = max((val[n - 1]
                    + knapSackRec(W - wt[n - 1], wt, val,
                            n - 1, dp)),
                    knapSackRec(W, wt, val, n - 1, dp));
    }

    public int knapSack2(int W, int wt[], int val[], int N) {

        // Declare the table dynamically
        int dp[][] = new int[N + 1][W + 1];

        // Loop to initially filled the
        // table with -1
        for (int i = 0; i < N + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;

        return knapSackRec(W, wt, val, N, dp);
    }

    public int knapSack3(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1]
                            + K[i - 1][w - wt[i - 1]],
                            K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[n][W];
    }

    public int knapSack4(int W, int wt[], int val[], int n) {
        // Making and initializing dp array
        int[] dp = new int[W + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int w = W; w >= 0; w--) {

                if (wt[i - 1] <= w)

                    // Finding the maximum value
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]]
                            + val[i - 1]);
            }
        }
        // Returning the maximum value of knapsack
        return dp[W];
    }

}
