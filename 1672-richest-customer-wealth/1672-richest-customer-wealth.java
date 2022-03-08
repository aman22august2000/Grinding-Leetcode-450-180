class Solution {
    public int maximumWealth(int[][] accounts) {
      int sum,mx=-1;
        for(int i=0;i<accounts.length;i++)
        {
          sum=0;
          for(int j=0;j<accounts[i].length;j++)
          {
            sum=sum+accounts[i][j];
          }
          if(sum>mx)
            mx=sum;
        }
      return mx;
    }
}