class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int ans[][]=new int[m-2][n-2];
        for(int i=0;i<m-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                int max=Integer.MIN_VALUE;
                max=Math.max(max,grid[i][j]);
                max=Math.max(max,grid[i][j+1]);
                max=Math.max(max,grid[i][j+2]);
                max=Math.max(max,grid[i+1][j]);
                max=Math.max(max,grid[i+1][j+1]);
                max=Math.max(max,grid[i+1][j+2]);
                max=Math.max(max,grid[i+2][j]);
                max=Math.max(max,grid[i+2][j+1]);
                max=Math.max(max,grid[i+2][j+2]);
                ans[i][j]=max;
            }
        }
        return ans;
    }
}