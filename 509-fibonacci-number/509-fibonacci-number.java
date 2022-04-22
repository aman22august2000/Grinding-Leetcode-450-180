class Solution {
    public int fib(int n) {
      if(n<2) return n;
      int a=0,b=1;
      while(n-->1)
      {
        int temp=a;
        a=b;
        b=b+temp;
      }
      return b;
    }
}