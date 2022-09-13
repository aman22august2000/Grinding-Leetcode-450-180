class Solution {
    public int minGroups(int[][] intervals) {
        int res=0,curr=0,n=intervals.length,A[][]=new int[2*n][2];
        for(int i=0;i<n;i++)
        {
            A[2*i]=new int[]{intervals[i][0],1};
            A[2*i+1]=new int[]{intervals[i][1]+1,-1};
        }
        Arrays.sort(A,Comparator.comparingInt(o->o[0]*3+o[1]));
        for(int []a : A)
        {
            res=Math.max(res,curr+=a[1]);
        }
        return res;
    }
}