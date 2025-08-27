/*
Problem Statement:
------------------
In other words, find the number of times the sorted array has been rotated.

Example 1:
----------
Input: nums = [15, 18, 2, 3, 6, 12]
Output: 2
Explanation: The original sorted array [2, 3, 6, 12, 15, 18] 
has been rotated 2 times.

Example 2:
----------
Input: nums = [7, 9, 11, 12, 5]
Output: 4
Explanation: The original sorted array [5, 7, 9, 11, 12] 
has been rotated 4 times.

Constraints:
------------
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4
- Array contains distinct elements
- Array is originally sorted in increasing order
*/

public class NoOfTimesArrayIsRotated {

    public static int findRotationCount(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            if(nums[start]<=nums[end]){
                return start;
            }
            int mid=(start+end)/2;
            int prev;
            if(mid==0)
                prev=n-1;
            else
                prev=(mid-1)%n;          //without if: (mid-1)%n gives -1 if mid =0 so use (((mid-1)%n)+n)%n
            int next=(mid+1)%n;     
            if(nums[mid]<nums[prev] /*&& nums[mid]<nums[next]*/){
                return mid;
            }
            else{
                if(nums[start]<=nums[mid]){      
                    start=mid+1;
                    
                    /*why <= and not < ? 
                    this is tied to while loop condition 
                    if <= used in while loop, same has to be done here to handle condition (start = mid = end) otherwise loop gets stuck in infinity*/
                }
                else{
                    end=mid;
                }

                /* why start = mid+1 but end = mid ?
                When above condition is true, it means the left half is sorted (including mid). So the minimum element in left half is nums[start], 
                but the rotation would make something smaller exist on the right so right half can exclude mid as there is no chance mid is min element.
                But when condition is false, right half is sorted; so min element is in left half and could be the mid element (as 1st element is no longer minimum)
                so end = mid (to include mid element in the search)*/
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2}; // <-- Just change this array for testing
        int result = findRotationCount(nums);
        System.out.println("Array is rotated " + result + " times.");
    }
}
