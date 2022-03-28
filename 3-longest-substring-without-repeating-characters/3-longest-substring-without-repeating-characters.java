class Solution {
    public int lengthOfLongestSubstring(String s) {
      int i=0,j=0,max=0;
      Set<Character> st=new HashSet<>();
      
      while(j<s.length())
      {
        if(!st.contains(s.charAt(j)))
        {
          st.add(s.charAt(j++));
          max=Math.max(max,st.size());          
        }
        else
        {
          st.remove(s.charAt(i++));
        }
      }
      return max;
    }
}