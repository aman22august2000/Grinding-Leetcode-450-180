class Solution {
    public int majorityElement(int[] nums) {
      int n=nums.length;
      int mxel=nums[0],cnt=1;
      for(int i=1;i<n;i++)
      {
        if(cnt==0)
        {          
          cnt++;
          mxel=nums[i];
        }
        else if(mxel==nums[i]) cnt++;
        else cnt--;
      }
      return mxel;
    }
}