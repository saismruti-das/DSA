class Solution {
    public int[] sortedSquares(int[] nums) {
        //Two pointer O(n)
        int left=0;
        int right=nums.length-1;
        int pos=right;
        int[] ans= new int[nums.length];
        while(left <= right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if (leftsq > rightsq){
                ans[pos--]=leftsq;
                left++;
            }
            else{
                ans[pos--]=rightsq;
                right--;
            }
        }
        return ans;

        // //squaring and sorting O(n log n)
        // for(int i=0; i<nums.length; i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
    }
}
