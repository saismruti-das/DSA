class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start++;
                end--;
            }
            //we need to find which part is sorted
            else if(nums[start]<=nums[mid]){  //left is sorted
                //if target lies in left
                if(nums[start]<=target && target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{   //right is sorted
                //target exists in right
                if(nums[mid]<=target && target<=nums[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;  
                }
            }
        }
        return false;
    }
}
