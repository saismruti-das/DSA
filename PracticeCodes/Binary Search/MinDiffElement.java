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
    static int FindFloorIndex(int[] nums, int key){
        int floor=-1;
        int start=0;
        int end=nums.length-1;
        if(key<nums[0]){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(key==nums[mid]){
                return mid;
            }
            else if(key>nums[mid]){
                floor=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return floor;
    }

    static int FindCeilIndex(int[] nums, int key){
        int ceil=-1;
        int start=0;
        int end=nums.length-1;
        if(key>nums[end]){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(key==nums[mid]){
                return mid;
            }
            else if(key>nums[mid]){
                start=mid+1;
            }
            else{
                ceil=mid;
                end=mid-1;
            }
        }
        return ceil;
    }

    public static int findMinDiffElement(int[] nums, int key) {
        int res;
        int floorIndex=FindFloorIndex(nums, key);
        int ceilIndex=FindCeilIndex(nums, key);

        // System.out.println("Floor Index: " + floorIndex);
        // System.out.println("Ceil Index: " + ceilIndex);

        if(floorIndex==-1){
            res=nums[ceilIndex];
        }
        else if(ceilIndex==-1){
            res=nums[floorIndex];
        }
        else if(Math.abs(key-nums[floorIndex])<Math.abs(key-nums[ceilIndex])){
            res=nums[floorIndex];
        }
        else{
            res=nums[ceilIndex];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 10, 15}; // <-- Change array here
        int key = 24;                   // <-- Change key here

        int result = findMinDiffElement(nums, key);
        System.out.println("Element with minimum difference: " + result);
    }
}
