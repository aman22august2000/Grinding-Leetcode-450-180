class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int l=nums.length;
        int ans[]=new int[l];
        int tSum=0;
        for(int x:nums)
        {
            if(x%2==0)
                tSum+=x;
        }
        
        for(int i=0;i<l;i++)
        {
            int val=queries[i][0],idx=queries[i][1];
            if(nums[idx]%2==0)
            {
                tSum=tSum-nums[idx];
            }
            nums[idx]=nums[idx]+val;
            if(nums[idx]%2==0)
            {
                tSum=tSum+nums[idx];
            }
            ans[i]=tSum;
        }
        return ans;
    }
}