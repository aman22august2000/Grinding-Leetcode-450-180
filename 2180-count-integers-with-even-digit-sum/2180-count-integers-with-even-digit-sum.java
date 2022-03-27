class Solution {
    public int countEven(int num) {
      int cnt=0;
      while(num>0)
      {
        int sum=0;
        int x=num;
        while(x>0)
        {
          int rem=x%10;
          sum=sum+rem;
          x=x/10;
        }
        if(sum%2==0)
        cnt++; 
        num--;
      }
      return cnt;
    }
}