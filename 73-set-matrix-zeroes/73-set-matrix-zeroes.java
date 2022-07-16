class Solution {
    public void setZeroes(int[][] mat) {
        ArrayList<Integer> row=new ArrayList<Integer>();
        ArrayList<Integer> col=new ArrayList<Integer>();
        int r=mat.length,c=mat[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[row.get(i)][j]=0;
            }
        }
        for(int i=0;i<col.size();i++)
        {
            for(int j=0;j<r;j++)
            {
                mat[j][col.get(i)]=0;
            }
        }
    }
}