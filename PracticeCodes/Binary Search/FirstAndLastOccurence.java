//given an sorted array of elements and a target element, find the index of the target element in the array

import java.util.*;
class FirstAndLastOccurence{

    static int firstOccurence(int[] arr, int x){
        int start=0;
        int end=arr.length-1;
        int res=-1;

        while(start<=end){
            int mid =(int) (start+end)/2;

            if(arr[mid]==x){
                res=mid;
                end=mid-1;
            }

            else if(x > arr[mid])     //x is present in right side
                start=mid+1;

            else
            end=mid-1;
        }
        return res;
    }

    static int lastOccurence(int[] arr, int x){     //searching for element again -> can be optimized using 3 func 1 seperate to find mid
        int start=0;
        int end=arr.length-1;
        int res=-1;

        while(start<=end){
            int mid =(int) (start+end)/2;

            if(arr[mid]==x){
                res=mid;
                start=mid+1;
            }

            else if(x > arr[mid])     //x is present in right side
                start=mid+1;

            else
            end=mid-1;
        }
        return res;
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
            
            System.out.println("First Index of target: "+firstOccurence(arr, target));
            System.out.print("Last Index of target: "+lastOccurence(arr, target));

        }
    }
}