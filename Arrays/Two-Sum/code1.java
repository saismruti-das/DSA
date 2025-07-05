//1st approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r={-1,-1};
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    r[0]=i;
                    r[1]=j;
                    return r;
                }
            }
        }
        return r;
    }
}
