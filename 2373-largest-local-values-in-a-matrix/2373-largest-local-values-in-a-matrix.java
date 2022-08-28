class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int ans[][]=new int[m-2][n-2];
        for(int i=0;i<m-2;++i)
        {
            for(int j=0;j<n-2;++j)
            {
                for(int ii=i;ii<i+3;++ii)
                {
                    for(int jj=j;jj<j+3;++jj)
                        ans[i][j]=Math.max(ans[i][j],grid[ii][jj]);
                }
            }
        }
        return ans;
    }
}