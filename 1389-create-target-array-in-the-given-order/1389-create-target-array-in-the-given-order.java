class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      int ans[]=new int[nums.length];
      ArrayList<Integer> ar=new ArrayList<Integer>();
      for(int i=0;i<nums.length;i++)
      {
        ar.add(index[i],nums[i]);
      }
      for(int i=0;i<nums.length;i++)
      {
        ans[i]=ar.get(i);
      }
      return ans;
    }
}