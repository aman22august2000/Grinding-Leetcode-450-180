class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null) return 0;
        int m=nums1.length,n=nums2.length;
        int dp[][]=new int[m+1][n+1];
        int max=0;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else
                {
                    if(nums1[i-1]==nums2[j-1])
                    {
                        dp[i][j]=1+dp[i-1][j-1];
                        max=Math.max(max,dp[i][j]);
                    }
                }
            }
        }
        return max;
    }
}