class Solution {
    public int FindFirst(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int first=-1;        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return first;
    }

    public int FindLast(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int last=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (nums[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return last; 
    }

    public int[] searchRange(int[] nums, int target) {
        int first=FindFirst(nums, target);
        int last= FindLast(nums,target);
        return new int[] {first,last};
    }
}
