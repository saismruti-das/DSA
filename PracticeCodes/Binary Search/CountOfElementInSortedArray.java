
/*
Problem Statement:
------------------
You are given a sorted array of integers `nums` and an integer `target`. 
Your task is to return the number of times `target` appears in `nums`.

Example 1:
----------
Input: nums = [1,2,2,2,3,4], target = 2
Output: 3
Explanation: The number 2 appears 3 times in the array.

Example 2:
----------
Input: nums = [1,1,2,3,5,5,5,6], target = 4
Output: 0
Explanation: The number 4 does not appear in the array.

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i], target <= 10^4
- nums is sorted in non-decreasing order
*/

class Solution {
    static int FirstOccurence(int[] arr, int x){
        int start=0;
        int end=arr.length;
        int first=-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                first=mid;
                end=mid-1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }

    static int LastOcuurence(int[] arr, int x){
        int start=0;
        int end=arr.length;
        int last=-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                last=mid;
                start=mid+1;
            }
            else if(x>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last;
    }

    public int countOccurrences(int[] nums, int target) {
        int first=FirstOccurence(nums,target);
        int last=LastOcuurence(nums,target);
        return last-first+1;
    }
}

public class CountOfElementInSortedArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,2,2,2,3,4};
        int target = 2;
        System.out.println(sol.countOccurrences(nums, target)); // Expected output: 3
    }
}
