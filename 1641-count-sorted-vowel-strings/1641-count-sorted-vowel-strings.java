class Solution {
    public int countVowelStrings(int n) {
        int dp[]=new int[6];
      dp[0]=0;
      for(int i=1;i<dp.length;i++)
        dp[i]=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=5;j++)
          dp[j]+=dp[j-1];
      }
      return dp[5];
    }
}