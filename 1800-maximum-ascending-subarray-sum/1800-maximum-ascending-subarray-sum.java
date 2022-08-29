class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0],s=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                sum=sum+nums[i];
            }
            else
            {
                s=Math.max(s,sum);                
                sum=nums[i];
            }
        }
        return Math.max(s,sum);
    }
}