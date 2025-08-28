/*
Problem Statement:
------------------
Given an unsorted array `nums`, find a peak element. 
A peak element is one that is strictly greater than its neighbors. 
Return the index of any one peak element.  

Note:
- nums[i] is a peak if nums[i] > nums[i-1] and nums[i] > nums[i+1].
- For corner elements, only one neighbor needs to be considered.

Examples:
---------
Input: nums = [1, 2, 3, 1]       → Output: 2   (nums[2] = 3 is a peak)
Input: nums = [1, 2, 1, 3, 5, 6] → Output: 1 or 5 (nums[1]=2 or nums[5]=6)

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
*/

public class FindPeak {

    public static int findPeakElement(int[] nums) {
        //if i use start<=end then it end when end<start but if i use start<end, it ends at start=end. we want condn start=end=peak
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){  //peak in left side including mid
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4}; // <-- Change array here
        int result = findPeakElement(nums);
        System.out.println("Index of a peak element: " + result);
    }
}

