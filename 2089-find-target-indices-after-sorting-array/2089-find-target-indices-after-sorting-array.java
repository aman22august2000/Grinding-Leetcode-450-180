class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      ArrayList<Integer> ls=new ArrayList<>();
      Arrays.sort(nums);
      int id=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]==target)
          ls.add(i);          
      }
      return ls;
    }
}