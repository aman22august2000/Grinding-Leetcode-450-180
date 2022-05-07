class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      int cnt=0,lt=0;
      for(int n:nums)
      {
        if(n==target) cnt++;
        else if(n<target) lt++;
      }
      ArrayList <Integer> ls=new ArrayList <Integer>();
      for(int i=lt;i<lt+cnt;i++)
      {
        ls.add(i);
      }
      return ls;
    }
}