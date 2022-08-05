class Solution {
    public int countElements(int[] nums) {
        int ans=0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==min)
                cnt++;
            else if(nums[i]==max)
                cnt++;
        }
        return nums.length-cnt;
    }
}