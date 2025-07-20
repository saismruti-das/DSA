class Solution {
    public int possibleStringCount(String word) {
        int count=0;
        for (int i=1; i<word.length(); i++){
            char c=word.charAt(i);
            char prev=word.charAt(i-1);
            if (c==prev){
                count+=1;
            }
        }
        return count+1;
    }
}
