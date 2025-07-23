class Solution {
    public boolean isPalindrome(String s) {
       String new_s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  //using regex
       int left=0;
       int right=new_s.length()-1;
       while(left<=right){
        if ((new_s.charAt(left))!=(new_s.charAt(right))){
            return false;
        }
        right--;
        left++;
       }
       return true;
    }
}
