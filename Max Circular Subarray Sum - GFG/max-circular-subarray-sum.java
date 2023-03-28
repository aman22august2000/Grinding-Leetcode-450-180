//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int arr[], int n) {
        
        // Your code here
        int max_normal=normalMaxSum(arr,n);
        if(max_normal<0)
        return max_normal;
        
        int arr_sum=0;
        for(int i=0;i<n;i++)
        {
            arr_sum+=arr[i];
            arr[i]=-1*arr[i];
        }
        int max_circular=arr_sum+normalMaxSum(arr,n);
        return Math.max(max_normal,max_circular);
    }
    static int normalMaxSum(int arr[],int n)
    {
        int res=arr[0], maxEnding=arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnding=Math.max(arr[i],maxEnding+arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}

