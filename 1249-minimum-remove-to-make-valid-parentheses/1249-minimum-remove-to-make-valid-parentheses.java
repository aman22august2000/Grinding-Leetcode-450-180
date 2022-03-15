class Solution {
    public String minRemoveToMakeValid(String s) {
      char ch[]=s.toCharArray();
      int op=0;
      
      for(int i=0;i<s.length();i++)
      {
        if(ch[i]=='(')
          op++;
        else if(ch[i]==')')
        {
          if(op==0)
            ch[i]='*';
          else
            op--;
        }
      }
      for(int i=s.length()-1;i>=0;i--)
      {
        if(op>0 && ch[i]=='(')
        {
          ch[i]='*';
          op--;
        }
      }
      int p=0;
      for(int i=0;i<ch.length;i++)
      {
        if(ch[i]!='*')
          ch[p++]=ch[i];
      }      
      return new String(ch).substring(0,p);
    }
}