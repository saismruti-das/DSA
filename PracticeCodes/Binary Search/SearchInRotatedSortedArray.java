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

    static int FindMinIndex(int[] nums){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            if(nums[start]<=nums[end]){
                return start;
            }
            int mid =(start+end)/2;
            int prev=(mid-1+n)%n;
            if(nums[mid]<nums[prev]){
                return mid;
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
        return 0;
    }

    static int binarySearch(int[] arr, int start, int end, int x){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n=nums.length;
        int minIndex=FindMinIndex(nums);
        int index;
        if(minIndex==0){        //no rotation
            index = binarySearch(nums, 0, n-1, target);
        }
        else{
            int leftHalf= binarySearch(nums, 0, minIndex-1, target);
            int rightHalf= binarySearch(nums, minIndex, n-1, target);
            index = Math.max(leftHalf, rightHalf);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};          // <-- Change array here
        int target = 4;               // <-- Change target here

        int result = search(nums, target);
        System.out.println("Target is at index: " + result);
    }
}
