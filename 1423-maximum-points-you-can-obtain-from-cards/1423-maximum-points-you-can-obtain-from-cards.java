class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int arr[]=new int[2*k];
        for(int i=0;i<k;i++)
        {
            arr[i]= cardPoints[n-k+i];
        }
        for(int i=0;i<k;i++)
        {
            arr[i+k]=cardPoints[i];
        }
        for(int i=1;i<2*k;i++)
        {
            arr[i]=arr[i]+arr[i-1];
        }
        int ans=arr[k-1];
        for(int i=k;i<2*k;i++)
        {
            ans=Math.max(ans,arr[i]-arr[i-k]);
        }
        return ans;
    }
}