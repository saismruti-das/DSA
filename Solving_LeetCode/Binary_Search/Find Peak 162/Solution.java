class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end) {
            int mid = (start + end) / 2;
            
            if(nums[mid] > nums[mid + 1]) {
                // Peak lies on the left side (including mid)
                end = mid;
            } else {
                // Peak lies on the right side
                start = mid + 1;
            }
        }
        
        // start == end at the peak
        return start;
    }
}
