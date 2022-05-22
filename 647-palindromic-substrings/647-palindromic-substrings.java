class Solution {
    public int countSubstrings(String s) {
      int l=s.length();
      boolean dp[][]=new boolean [l][l];
      for(int i=0;i<l;i++)
      {
        for(int j=0;j<l;j++)
        {
          dp[i][j]=false;
        }
      }      
      for(int i=0;i<l;i++)
      {
        dp[i][i]=true;
      }
      for(int i=0;i<l-1;i++)
      {
        if(s.charAt(i)==s.charAt(i+1))
          dp[i][i+1]=true;
      }
      
      for(int gap=2;gap<l;gap++)
      {
        int i=0;
        int j=gap;
        while(i<l-gap && j<l)
        {
          if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
            dp[i][j]=true;
          i++;
          j++;
        }
      }
      int cnt=0;
      for(int i=0;i<l;i++)
      {
        for(int j=0;j<l;j++)
        {
          if(dp[i][j]==true)
            cnt++;
        }
      }
      return cnt;
    }
}