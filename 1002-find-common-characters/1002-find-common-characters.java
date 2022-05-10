class Solution {
    public List<String> commonChars(String[] A) {
        
      int last[]=count(A[0]);
      
      for(int i=0;i<A.length;i++)
      {
        last=intersection(last,count(A[i]));
      }
      
      List<String> ls=new ArrayList<>();
      for(int i=0;i<26;i++)
      {
        if(last[i]!=0)
        {
          char a='a';
          a+=i;
          String s=String.valueOf(a);
          while(last[i]>0)
          {
            ls.add(s);
            last[i]--;
          }
        }
      }
      return ls;
    }
  int [] intersection(int [] a,int [] b)
  {
    int t[]=new int[26];
    for(int i=0;i<26;i++)
    {
      t[i]=Math.min(a[i],b[i]);
    }
    return t;
  }
  int [] count(String st)
  {
    int t[]=new int[26];
    for(char c: st.toCharArray()) t[c -'a']++;
    return t;
  }
}