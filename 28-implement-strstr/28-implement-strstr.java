class Solution {
    public int strStr(String haystack, String needle) {
      int l=needle.length();
      int n=haystack.length();
      if(l==0)
        return 0;
      if(n==0)
        return -1;
      // if(n==l)
      //   return 0;
      for(int i=0;i<n-l+1;i++)
      {
        if(haystack.substring(i,i+l).equals(needle))
          return i;
      }
      return -1;
    }
}