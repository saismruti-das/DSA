import java.util.*;

public class knapsackDP {
    static int[][] table;
    public static void main(String[] args) {
        // Input: number of items
        try (Scanner sc = new Scanner(System.in)) {
            // Input: number of items
            System.out.print("Enter number of items: ");
            int n = sc.nextInt();
            
            int[] val = new int[n];
            int[] wt = new int[n];
            
            // Input: values
            System.out.println("Enter values of items:");
            for (int i = 0; i < n; i++) {
                val[i] = sc.nextInt();
            }
            
            // Input: weights
            System.out.println("Enter weights of items:");
            for (int i = 0; i < n; i++) {
                wt[i] = sc.nextInt();
            }
            
            // Input: capacity of knapsack
            System.out.print("Enter knapsack capacity: ");
            int W = sc.nextInt();
            
            //initialize table
            table = new int[n+1][W+1];
            
            //base case / initialization
            for(int i=0; i<n+1; i++){
                for(int j=0; j<W+1; j++){
                    if (i==0 || j==0){
                        table[i][j]=0;
                    }
                }
            }

            //choice
            for(int i=1; i<n+1; i++){
                for(int j=1; j<W+1; j++){
                    if (wt[i-1]<=j){
                        table[i][j]= Math.max(val[i-1]+table[i-1][j-wt[i-1]], table[i-1][j]);
                    }
                    else{
                        table[i][j]=table[i-1][j];
                    }
                }
            }
                       
            System.out.println("Maximum value = " + table[n][W]);
        }
    }
}
