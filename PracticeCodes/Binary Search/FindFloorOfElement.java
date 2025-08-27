/*
Problem Statement:
------------------
You are given a sorted array of integers `nums` (in non-decreasing order) 
and an integer `target`. 

Your task is to find the floor of `target` in the array. 
The floor of `target` is the greatest element in the array 
that is less than or equal to `target`.

Example 1:
----------
Input: nums = [1, 2, 4, 6, 10, 12, 14], target = 5
Output: 4
Explanation: The floor of 5 is 4.

Example 2:
----------
Input: nums = [1, 2, 4, 6, 10, 12, 14], target = 0
Output: floor doesn't exist
Explanation: There is no element less than or equal to 0.

Example 3:
----------
Input: nums = [1, 2, 4, 6, 10, 12, 14], target = 14
Output: 6
Explanation: The floor of 14 is 14 itself.

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i], target <= 10^4
- nums is sorted in non-decreasing order
*/

public class FindFloorOfElement {

    public static int findFloor(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int res=-1;
        if(target<nums[0]){
            return -1;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;              //floor is less than or equal to target
            }
            else{
                if(mid>res){
                    res=mid;
                }
                start=mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 10, 12, 14}; // <-- Change array here
        int target = 10;                        // <-- Change target here

        int result = findFloor(nums, target);
        if(result==-1){
            System.out.println("Floor doesn't exist");
        }
        else
        System.out.println("Floor element: " + nums[result]);

        
    }
}
