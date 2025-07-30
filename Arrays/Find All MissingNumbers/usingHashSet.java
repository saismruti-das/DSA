class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i: nums){
            set.add(i);
        }
        List<Integer> doNotAppear=new ArrayList<>(); 
        for (int i=1; i<=nums.length; i++){
            if (!set.contains(i)){
                doNotAppear.add(i);
            }
        }
        return doNotAppear;
    }
}
