class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
      int lo=1,hi=Integer.MAX_VALUE;
      while(true){
        int mid=lo+(hi-lo)/2;
        if(mid>x/mid)
          hi=mid-1;
        else{
          if(mid+1>x/(mid+1))
            return mid;
          lo=mid+1;
        }
      }
    }
}