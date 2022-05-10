class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
      Set<Integer> set=new HashSet<Integer>();
      Set<Integer> inter=new HashSet<Integer>();
      
      for(int i=0;i<nums1.length;i++)
      {
        set.add(nums1[i]);
      }
      for(int j=0;j<nums2.length;j++)
      {
        if(set.contains(nums2[j]))
          inter.add(nums2[j]);
      }
      int k=0;
      int res[]=new int[inter.size()];
      for(int n:inter)
        res[k++]=n;
      return res;
    }
}