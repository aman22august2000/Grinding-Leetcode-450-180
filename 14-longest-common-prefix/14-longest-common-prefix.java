class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs.length==0 || strs==null)
        return "";
      Arrays.sort(strs);
      String first =strs[0];
      String last=strs[strs.length-1];
      int cnt=0;
      String s;
      while(cnt<first.length())
      {
        if(first.charAt(cnt)==last.charAt(cnt))
          cnt++;
        else
          break;
      }
      return cnt == 0 ? "" :first.substring(0,cnt);
    }
}