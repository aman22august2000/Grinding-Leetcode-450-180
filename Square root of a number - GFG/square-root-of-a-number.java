//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long lo=1,hi=x,ans=-1;
		while(lo<=hi)
		{
		    long mid=(lo+hi)/2;
		    long mSq=mid*mid;
		    if(mSq==x)
		    return mid;
		    else if(mSq>x)
		    hi=mid-1;
		    else
		    {
		        lo=mid+1;
		        ans=mid;
		    }
		}
		return ans;
	 }
}
