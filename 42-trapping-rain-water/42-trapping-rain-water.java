class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,max=0,lmx=0,rmx=0;
        while(i<=j)
        {
            lmx=Math.max(lmx,height[i]);
            rmx=Math.max(rmx,height[j]);
            if(lmx<rmx)
            {
                max+=lmx-height[i];
                i++;
            }
            else
            {
                max+=rmx-height[j];
                j--;
            }
        }
        return max;
    }
}