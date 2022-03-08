class Solution {
    public int mostWordsFound(String[] sentences) {
      int cnt,mx=-1;
      for(int i=0;i<sentences.length;i++)
      {
        cnt=0;
        String str=sentences[i];
        cnt=str.split(" ").length;
        if(cnt>mx)
          mx=cnt;
      }
      return mx;
    }
}