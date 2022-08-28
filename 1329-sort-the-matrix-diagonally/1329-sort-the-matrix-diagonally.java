class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> dg=new HashMap<>();
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                dg.putIfAbsent(i-j,new PriorityQueue<>());
                dg.get(i-j).add(mat[i][j]);
            }
        }
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                mat[i][j]=dg.get(i-j).poll();
            }
        }
        return mat;
    }
}