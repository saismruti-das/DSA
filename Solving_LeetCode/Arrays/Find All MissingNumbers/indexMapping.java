class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //making index negetive methode
        for(int i=0; i<nums.length; i++){
            int index=Math.abs(nums[i])-1;            //if number is 1 we map it to 0
            if(nums[index]>0){
                nums[index]=nums[index]*(-1);
            }
        }

        List<Integer> missing=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if (nums[i]>0){       //if no still positive add it's mapped index which is i+1
                missing.add(i+1);
            }
        }
        return missing;

        
