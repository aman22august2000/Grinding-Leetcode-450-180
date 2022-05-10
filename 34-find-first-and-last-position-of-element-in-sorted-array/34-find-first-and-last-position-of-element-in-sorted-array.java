class Solution {
    public int[] searchRange(int[] nums, int target) {
        
      int l=nums.length;
      int res[]={-1,-1};
      int lo=0,hi=l-1;
      while(lo<=hi)
      {
        int mid=(lo+hi)/2;
        if(nums[mid]==target)
        {
          res[0]=mid;
          hi=mid-1;
        }
        else if(nums[mid]<target)
        {
          lo=mid+1;
        }
        else hi=mid-1;
      }
      lo=0;
      hi=l-1;
      while(lo<=hi)
      {
        int mid=(lo+hi)/2;
        if(nums[mid]==target)
        {
          res[1]=mid;
          lo=mid+1;
        }
        else if(nums[mid]<target)
        {
          lo=mid+1;
        }
        else hi=mid-1;
      }
      return res;
    }
}