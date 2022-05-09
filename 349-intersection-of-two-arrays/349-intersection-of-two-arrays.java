class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
      Set<Integer> set=new HashSet<Integer>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0;
      int id=0;
      
      while(i<nums1.length && j<nums2.length)
      {
        if(nums1[i]>nums2[j]) j++;
        else if(nums1[i]<nums2[j]) i++;
        else if(nums1[i]==nums2[j])
        {
          set.add(nums1[i]);
          i++;
          j++;
        }
      }
      
      int result[]=new int[set.size()];
      int idx=0;
      for(int n:set)
        result[idx++]=n;
      return result;
    }
}