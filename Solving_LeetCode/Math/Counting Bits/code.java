class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        ans[0]=0;                    //0-->0
        // int i=1;
        // while(i<=n){
        //     ans[i]=1;               //1-->1, 2-->1, 4-->1, 8-->1
        //     i*=2;
        // }

        for( int j=1; j<=n; j++){
            if((j & (j-1))==0){           //check if j is power of 2
                ans[j]=1;
            }
            else if (j%2==0){
                ans[j]=ans[j/2];
            }
            else{
                ans[j]=ans[j/2]+1;
            }
        }
        return ans;
    }
}
