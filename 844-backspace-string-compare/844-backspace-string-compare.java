class Solution {
    public boolean backspaceCompare(String s, String t) {
        return stackSolution(s).equals(stackSolution(t));
    }
  private String stackSolution(String str)
  {
    Stack<Character> stack=new Stack<Character>();
    
    for(char c : str.toCharArray()){
      
      if(c!= '#'){
        stack.push(c);

    }
    else if(!stack.isEmpty())
      stack.pop();
    }
  
  return stack.toString();
}
}