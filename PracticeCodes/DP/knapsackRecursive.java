import java.util.*;

public class knapsackRecursive {

    // Function to return maximum value that can be put in knapsack
    static int knapsack(int[] wt, int[] val, int W, int n) {
        //Base case
        if (W==0 || n==0){
            return 0;
        }

        //choice
        if (wt[n-1]<=W){
            return Math.max(val[n-1] + knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }
        else{
            return knapsack(wt, val, W, n-1);
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
            int capacity = sc.nextInt();
            
            // Call knapsack function
            int result = knapsack(weights, values, capacity, n);
            
            System.out.println("Maximum value = " + result);
        }
    }
}
