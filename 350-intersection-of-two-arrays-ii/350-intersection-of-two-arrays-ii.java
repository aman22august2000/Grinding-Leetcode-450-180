class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
      ArrayList<Integer> ls=new ArrayList<Integer>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0,j=0,id=0;
      while(i<nums1.length && j<nums2.length)
      {
        if(nums1[i]==nums2[j])
        {
          ls.add(nums1[i]);
          i++;
          j++;
        }
        else if(nums1[i]<nums2[j])
        {
          i++;
        }
        else if(nums1[i]>nums2[j])
        {
          j++;
        }
      }
      int k=0;
      int res[]=new int[ls.size()];
      for(int n:ls)
        res[k++]=n;
      return res;
    }
}