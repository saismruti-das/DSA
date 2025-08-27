/*
Problem Statement:
------------------
Given a sorted array `nums` and an integer `key`, find the element in the array 
that has the minimum absolute difference with `key`.

Examples:
---------
Input: nums = [1, 3, 8, 10, 15], key = 12 → Output: 10
Explanation: |12 - 10| = 2 is smaller than |12 - 15| = 3.

Input: nums = [2, 5, 6, 7, 8, 8, 9], key = 4 → Output: 5
Explanation: |4 - 5| = 1 is the smallest difference.

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i], key <= 10^4
- nums is sorted in non-decreasing order
*/

public class MinDiffElement {
    public static int findMinDiffElement(int[] nums, int key) {
        int res;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==nums[mid]){
                return nums[mid];
            }
            else if(key>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        if(end<0){
            res=nums[start];
        }
        else if(start>nums.length-1){
            res=nums[end];
        }
        else if(Math.abs(key-nums[end])<Math.abs(key-nums[start])){
            res=nums[end];
        }
        else{
            res=nums[start];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 10, 15}; // <-- Change array here
        int key = 9;                   // <-- Change key here

        int result = findMinDiffElement(nums, key);
        System.out.println("Element with minimum difference: " + result);
    }
}
