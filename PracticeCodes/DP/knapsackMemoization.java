/*
Problem Statement: 0/1 Knapsack

You are given n items, each with a weight wt[i] and a value val[i].
You also have a knapsack with capacity W.

Task:
Find the maximum total value of items that can be put in the knapsack
such that the total weight does not exceed W.

Constraint:
- Each item can either be included or excluded (0/1 choice).
- You cannot take fractional parts of an item.

Example:
Input:
    n = 3
    values = [60, 100, 120]
    weights = [10, 20, 30]
    W = 50

Output:
    220

Explanation:
    Choose items with weights 20 and 30 → total value = 100 + 120 = 220.
*/

import java.util.*;

public class knapsackMemoization {
    static int[][] table;

    // Function to return maximum value that can be put in knapsack
    static int knapsack(int[] wt, int[] val, int W, int n) {
        //Base case
        if (W==0 || n==0){
            return 0;
        }

        //checking if value already present in table
        if(table[n][W]!=-1){
            return table[n][W];
        }
        
        //choice
        if (wt[n-1]<=W){
            return table[n][W] = Math.max(val[n-1] + knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }
        else{
            return table[n][W] = knapsack(wt, val, W, n-1);
        }
    }

    public static void main(String[] args) {
        // Input: number of items
        try (Scanner sc = new Scanner(System.in)) {
            // Input: number of items
            System.out.print("Enter number of items: ");
            int n = sc.nextInt();
            
            int[] values = new int[n];
            int[] weights = new int[n];
            
            // Input: values
            System.out.println("Enter values of items:");
            for (int i = 0; i < n; i++) {
                values[i] = sc.nextInt();
            }
            
            // Input: weights
            System.out.println("Enter weights of items:");
            for (int i = 0; i < n; i++) {
                weights[i] = sc.nextInt();
            }
            
            // Input: capacity of knapsack
            System.out.print("Enter knapsack capacity: ");
            int W = sc.nextInt();
            
            //initialize table
            table = new int[n+1][W+1];
            for (int i=0; i<n+1; i++){
                Arrays.fill(table[i],-1);
            }
            
            // Call knapsack function
            int result = knapsack(weights, values, W, n);
            
            System.out.println("Maximum value = " + result);
        }
    }
}
