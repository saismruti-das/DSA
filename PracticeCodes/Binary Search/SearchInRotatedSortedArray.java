/*
Problem Statement:
------------------
You are given a rotated sorted array of distinct integers `nums` 
and an integer `target`. Your task is to return the index of `target` 
in `nums`. If the target is not found, return -1.

Note:
- A rotated sorted array means the array was originally sorted in 
  increasing order, but then rotated at some pivot.

Example 1:
----------
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
----------
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
----------
Input: nums = [1], target = 0
Output: -1

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i], target <= 10^4
- Array contains distinct elements
*/

public class SearchInRotatedSortedArray {

    static int binarySearch(int[] arr, int start, int end, int x){
        return -1;
    }

    public static int search(int[] nums, int target) {
        //S1 : Find Index of min element
        int n=nums.length;
        int index=-1;
        int start=0;
        int end=n-1;
        int minIndex=0;
        while(start<=end){
            if(nums[start]<=nums[end]){
                minIndex=start;
            }
            int mid =(start+end)/2;
            int prev=(((mid-1)%n)+n)%n;
            int next=(mid+1)%n;
            if(nums[mid]<nums[prev]){
                minIndex=mid;
            }
            else{
                if(nums[start]<=nums[mid]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
        System.out.println("Rotation?="+minIndex);
        if(minIndex==0){        //no rotation
            index = binarySearch(nums, 0, n, target);
        }
        else{
            int leftHalf= binarySearch(nums, 0, minIndex-1, target);
            int rightHalf= binarySearch(nums, minIndex, n, target);
            index = Math.max(leftHalf, rightHalf);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2}; // <-- Change array here
        int target = 0;               // <-- Change target here

        int result = search(nums, target);
        System.out.println("Target is at position: " + result+1);
    }
}
