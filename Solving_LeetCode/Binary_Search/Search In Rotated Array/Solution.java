class Solution {
    static int findMinIndex(int[] nums){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            //check if sorted
            if(nums[start]<nums[end])
            return start;

            int mid=(start+end)/2;
            int prev=(mid-1+n)%n;
            if(nums[mid]<nums[prev]){
                return mid;
            }
            else{
                if(nums[start]<=nums[mid]){
                    start=mid+1;
                }
                else
                end=mid;

            }
        }
        return 0;
    }

    static int binarySearch(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else
            end=mid-1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int minIndex=findMinIndex(nums);
        int index;
        if(minIndex==0){    //no rotation
            index=binarySearch(nums, 0, nums.length-1, target);
        }
        else{
            index=Math.max(binarySearch(nums, 0, minIndex-1, target),binarySearch(nums, minIndex, nums.length-1, target));
        }
        return index;
    }
}
