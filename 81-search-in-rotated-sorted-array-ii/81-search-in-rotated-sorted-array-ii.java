class Solution {
    public boolean search(int[] nums, int target) {
      int lo=0,hi=nums.length-1,mid=-1;
      while(lo<=hi)
      {
        mid=(lo+hi)/2;
        
        if(nums[mid]==target)
          return true;
        
        if(nums[mid]<nums[hi] || nums[mid]<nums[lo])
        {
          if(target>nums[mid] && target<=nums[hi])
            lo=mid+1;
          else
            hi=mid-1;
        }
        else if(nums[mid]>nums[lo] || nums[mid]>nums[hi])
        {
          if(target>=nums[lo] && target<nums[mid])
            hi=mid-1;
          else
            lo=mid+1;
        }
        else
        {
          hi--;
        }
      }
      return false;
    }
}