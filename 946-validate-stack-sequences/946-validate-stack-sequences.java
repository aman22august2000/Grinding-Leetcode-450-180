class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
      Stack<Integer> st=new Stack<>();
      int p=0;
      for(int i : pushed)
      {
        st.push(i);
        while(!st.isEmpty() && st.peek()==popped[p])
        {
          st.pop();
          p++;
        }
      }
      return st.isEmpty();
    }
}