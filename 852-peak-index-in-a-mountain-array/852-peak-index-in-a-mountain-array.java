class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=0,hi=arr.length-1;
      while(lo<=hi)
      {
        int mid=(hi+lo)/2;
        if(mid==arr.length)
        {
          if(arr[mid]>arr[mid-1]) return mid;
          else return mid-1;
        }
        else if(mid==0)
        {
          if(arr[mid]>arr[mid+1]) return mid;
          else return mid+1;
        }
        else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid-1;
        else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
      }
      return -1;
    }
}