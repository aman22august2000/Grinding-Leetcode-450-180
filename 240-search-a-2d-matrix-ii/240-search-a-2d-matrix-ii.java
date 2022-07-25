class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            int lo=0,hi=c-1;
            while(lo<=hi)
            {
                int mid=(lo+hi)/2;
                if(matrix[i][mid]==target)
                    return true;
                else if(matrix[i][mid]>target)
                    hi=mid-1;
                else lo=mid+1;
            }
        }
        return false;
    }
}