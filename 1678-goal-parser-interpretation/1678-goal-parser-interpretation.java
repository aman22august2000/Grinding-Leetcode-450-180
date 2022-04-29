class Solution {
    public String interpret(String str) {
      StringBuilder s = new StringBuilder(str.length());
        for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='G') s.append('G');
          if(str.charAt(i)=='(')
          {
            if(str.charAt(i+1)==')')
            {
              s.append('o');
              i++;
            }
            else
            {
              s.append("al");
              i+=3;
            }
          }
        }
      return s.toString();
    }
}