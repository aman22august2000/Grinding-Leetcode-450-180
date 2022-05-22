class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
      int n=mat.length;
      int [] res[]=new int[n][n]; //90 degree clockwise
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          res[i][j]=mat[n-1-j][i];
        }
      }
      
      int [] res1[]=new int[n][n]; //180 degree clockwise
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          res1[i][j]=res[n-1-j][i];
        }
      }
      
      int [] res2[]=new int[n][n]; //90 degree anticlockwise
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          res2[i][j]=res1[n-1-j][i];
        }
      }
      
      if(Arrays.deepEquals(mat,target) || Arrays.deepEquals(res,target) || Arrays.deepEquals(res1,target) || Arrays.deepEquals(res2,target))
        return true;
      else
        return false;
    }
}