/*
Problem Statement:
------------------
Given a sorted array of lowercase letters `letters` (length ≥ 2) 
and a character `target`, return the smallest character in `letters` 
that is strictly greater than `target`. 
If no such character exists, return the first element of `letters`.

Examples:
---------
Input: letters = ['c','f','j'], target = 'a' → Output: 'c'
Input: letters = ['c','f','j'], target = 'c' → Output: 'f'
Input: letters = ['x','x','y','y'], target = 'z' → Output: 'x'

Constraints:
------------
- 2 <= letters.length <= 10^4
- letters[i] and target are lowercase English letters
- letters is sorted in non-decreasing order
- letters contains at least two distinct characters
*/

public class FindNextLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        char res=letters[0];
        while(start<=end){
            int mid=(start+end)/2;
            if((int) letters[mid]<=(int) target){   //ascii value of a character can be found by type casting it to int
                start=mid+1;
            }
            else{
                res=letters[mid];
                end=mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        FindNextLetter obj = new FindNextLetter();

        char[] letters = {'x','x','y','y'};  // <-- change array here
        char target = 'z';                 // <-- change target here

        char result = obj.nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter after '" + target + "' is: " + result);
    }
}
