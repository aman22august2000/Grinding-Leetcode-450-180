class Solution {
    public int[] shuffle(int[] nums, int n) {
      int arr[]=new int[2*n];
      for(int i=0;i<n;i++)
      {
        arr[2*i]=nums[i];
      }
      for(int j=0;j<n;j++)
      {
        arr[2*j+1]=nums[j+n];
      }
      return arr;
    }
}