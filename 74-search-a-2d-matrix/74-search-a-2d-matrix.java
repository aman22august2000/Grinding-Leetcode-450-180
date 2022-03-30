class Solution 
{
    public boolean searchMatrix(int[][] a, int t) 
    {
       //  int flag=0;
       //  for(int i=1;i<a.length;i++)
       //  {
       //      if(t>=a[i-1][0] && t<=a[i][0])
       //      {
       //          for(int j=0;j<a[i].length;j++)
       //          {
       //              if(a[i][j]==t)
       //              flag=1;
       //          }
       //      }
       //  }
       // if(flag==1)
       //     return true;
       //  else
       //      return false;
      
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a[0].length;j++)
          if(a[i][j]==t)
            return true;
      }
      return false;
    }
}