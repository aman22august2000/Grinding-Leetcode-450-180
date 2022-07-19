class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int next[]=new int[n];
        Arrays.fill(next,-1);
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<2*n;i++)
        {
            int num=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<num)
            {
                next[st.pop()]=num;
            }
            if(i<n) st.push(i);
        }
        return next;
    }
}