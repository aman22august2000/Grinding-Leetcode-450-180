class Solution {
    public boolean isPerfectSquare(int num) {
      if(num<1) return false;
      long lo=1,hi=num;
      while(lo<=hi)
      {
        long mid=lo+(hi-lo)/2;
        long t=mid*mid;
        if(t>num) hi=mid-1;
        else if(t<num) lo=mid+1;
        else return true;
      }
      return false;
    }
}