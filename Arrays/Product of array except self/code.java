class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*Optimal Approach
        As we iterate the array
            we 1st calculate and store prefix in ans array
        then we re-iterate array
            calculate suffix for each element and update the ans array
         */

        //code
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        int suffix=1;
        for (int i=n-2; i>=0; i--){
            suffix= suffix*nums[i+1];
            ans[i]=ans[i]*suffix;
        }

        return ans;

        
        /*better approach
        for an element maintain 2 new arrays:
            prefix to keep track of all the elements before i and 
            suffix to keep tract of all element after i
        
        eg: for [1,2,3,4]
        prefix: [1,1,2,6]
        suffix: [24,12,4,1]
        */
        
        //code
        int n=nums.length;
        int[] suffix=new int[n];
        int[] prefix=new int[n];
        int[] ans=new int[n];

        prefix[0]=1;
        suffix[n-1]=1;

        //for filling up prefix
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        //for filling up suffix
        for (int i=n-2; i>=0; i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=prefix[i]*suffix[i];
        }
        return ans;

        //brute-force two loops one to iterate and another to find product.
        //Time: O(n^2)
    }
}
