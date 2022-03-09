class Solution {
    public int[] decompressRLElist(int[] nums) {
      int len=0;
        for(int i=0;i<nums.length;i=i+2)
        {
          len=len+nums[i];
        }
      int ans[]=new int[len];
      int j=0;
      for(int i=0;i<nums.length;i=i+2)
      {
        while(nums[i]-->0)
        {
          ans[j]=nums[i+1];
          j++;
        }
      }
      return ans;
    }
}