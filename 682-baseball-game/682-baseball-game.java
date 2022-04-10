class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : ops) {
            if(s.equals("C")) stack.pop();
            else if(s.equals("D")) stack.push(stack.peek() * 2);
            else if(s.equals("+")) {
                int top = stack.pop();
                int secondFromTop = stack.pop();
                stack.push(secondFromTop);
                stack.push(top);
                stack.push(top + secondFromTop);
            } else stack.push(Integer.parseInt(s));            
        }
        
        int result = 0;
        
        while(!stack.empty()) result += stack.pop();
        
        return result;
    }
}