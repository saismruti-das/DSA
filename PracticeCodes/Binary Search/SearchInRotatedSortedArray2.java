/*Given a rotated sorted array with duplicate values, return true if target element found, false otherwise */

public class SearchInRotatedSortedArray2 {

    static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            else if (nums[start] <= nums[mid]) { 
                // Left half sorted
                if (nums[start] <= target && target < nums[mid]) {      //if left is sorted and target is in left then value of target is b/w start and mid (not mid so don't check for equal), so we search left part by making end=mid-1
                    end = mid - 1;
                } else {                                                //if target not in sorted left then it is in unsorted right, so start=mid+1
                    start = mid + 1;
                }
            }
            else { 
                // Right half sorted
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,1}; // <-- Change array here
        int target = 1;                          // <-- Change target here

        boolean result = search(nums, target);
        System.out.println("Target found: " + result);
    }
}