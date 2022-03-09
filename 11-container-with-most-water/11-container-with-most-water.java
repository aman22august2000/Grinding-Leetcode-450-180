class Solution {
    public int maxArea(int[] height) {
      int mx=0,left=0,right=height.length-1;
      while(left<right)
      {
        mx=Math.max(mx,Math.min(height[left],height[right])*(right-left));
        if(height[left]<height[right])
        {
          left++;
        }
        else
        {
          right--;
        }
      }
      return mx;
    }
}