/*
Problem Statement:
------------------
You are given a nearly sorted array of distinct integers `nums` and an integer `target`.  
In a nearly sorted array, an element that should be at index `i` may be found at 
index `i - 1`, `i`, or `i + 1`.  

Your task is to return the index of `target` in `nums`.  
If the target is not found, return -1.

Example 1:
----------
Input: nums = [10, 3, 40, 20, 50, 80, 70], target = 40
Output: 2

Example 2:
----------
Input: nums = [10, 3, 40, 20, 50, 80, 70], target = 20
Output: 3

Example 3:
----------
Input: nums = [10, 3, 40, 20, 50, 80, 70], target = 90
Output: -1

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i], target <= 10^4
- Array contains distinct elements
*/

public class SearchInNearlySorted {

    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(mid>start && target==nums[mid-1]){
                return mid-1;
            }
            else if(mid<end && target==nums[mid+1]){
                return mid+1;
            }
            else if(target>nums[mid]){
                start=mid+2;
            }
            else{
                end=mid-2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10, 3, 40, 20, 50, 80, 70}; // <-- Change array here
        int target = 10;                          // <-- Change target here

        int result = search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
