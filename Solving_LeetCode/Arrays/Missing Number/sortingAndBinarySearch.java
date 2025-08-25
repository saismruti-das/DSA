class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i=0; i<=n; i++){
            if(Arrays.binarySearch(nums, i)<0){
                return i;
            }
        }
        return -1;        
    }
}
