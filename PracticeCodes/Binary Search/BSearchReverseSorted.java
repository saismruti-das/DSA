//given an reverse sorted array of elements and a target element, find the index of the target element in the array

import java.util.*;
class BSearchReverseSorted{

    static int binarySearch(int[] arr, int x){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid =(int) (start+end)/2;

            if(arr[mid]==x)
            return mid;

            else if(x < arr[mid])     //x is present in right side
                start=mid+1;

            else
            end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        //size of array
        try (Scanner sc = new Scanner (System.in)) {
            //size of array
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            
            //input array
            int[] arr=new int[n];
            System.out.println("Enter elements of array");
            for (int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            
            //target element
            System.out.println("Enter target elemet");
            int target=sc.nextInt();
            
            System.out.print("Index of target: "+binarySearch(arr, target));
        }
    }
}