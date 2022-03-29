class Solution {
    public int findDuplicate(int[] nums) {
      int id=0;
      while(nums.length!=0)
      {
        if(nums[id]==-1)
        {
          return id;
        }
        else
        {
          int n=nums[id];
          nums[id]=-1;
          id=n;
        }
      }
      return id;
    }
}