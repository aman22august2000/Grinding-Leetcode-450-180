class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      ArrayList<Integer> ls=new ArrayList<>();
      //Sorting
      int min=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++)
      {
        for(int j=i+1;j<nums.length;j++)
        {
          if(nums[i]>nums[j])
          {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
          }
        }
      }
      int id=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==target)
          ls.add(i);          
      }
      return ls;
    }
}