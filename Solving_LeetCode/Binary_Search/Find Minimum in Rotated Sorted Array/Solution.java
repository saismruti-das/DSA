class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int n=nums.length;
        int end=n-1;
        while(start<=end){
            if(nums[start]<=nums[end]){
                return nums[start];
            }
            int mid=(start+end)/2;
            int prev=(mid-1+n)%n;
            if(nums[mid]<nums[prev]){
                return nums[mid];
            }
            else{
                if(nums[start]<=nums[mid]){     //left is sorted
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
        }
        return nums[0];
    }
}
