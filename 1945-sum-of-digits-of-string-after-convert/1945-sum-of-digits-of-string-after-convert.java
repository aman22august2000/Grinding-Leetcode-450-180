class Solution {
    public int getLucky(String s, int k) {
      int sum=0;
      for(int i=0;i<s.length();i++)
      {
        sum+=getsum((s.charAt(i)-'a')+1);
      }
      
      while(k-->1)
      {
        sum=getsum(sum);
      }
      return sum;
    }
  public int getsum(int n)
  {
    int sum=0;
    while(n!=0)
    {
      sum+=n%10;
      n/=10;
    }
    return sum;
  }
}