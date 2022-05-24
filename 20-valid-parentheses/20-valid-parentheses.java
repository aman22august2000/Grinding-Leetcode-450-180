class Solution {
    public boolean isValid(String s) {
        
      Map<Character,Character> mp=new HashMap<>();
      mp.put(')','(');
      mp.put('}','{');
      mp.put(']','[');
      
      Stack<Character> st=new Stack<>();
      
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(mp.containsValue(c))
        {
          st.push(c);
        }
        else
        {
          if(st.isEmpty() || mp.get(c)!=st.pop())
            return false;
        }
      }
      return st.isEmpty();
    }
}