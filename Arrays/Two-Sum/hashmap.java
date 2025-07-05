class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen=new HashMap<>();     //store numbers we have seen with the number as key and index as value
        for (int i=0; i<nums.length; i++){
            int complement=target-nums[i];
            if (seen.containsKey(complement)){              //if complement in hashmap
                return new int[]{seen.get(complement), i};  //creating new array 
            }
            seen.put(nums[i],i);                           //if complement not in map then add the element in map with index number
        }
        return new int[]{-1,-1};                          //fallback
    }

}
