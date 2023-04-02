//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        // Pair<Integer,Integer> p=new Pair<>();
        long f=firstOcc(v,x);
        long l=lastOcc(v,x);
        pair p=new pair(f,l);
        return p;
    }
    public long firstOcc(long arr[], long x)
    {
        int lo=0,hi=arr.length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]>x)
            {
                hi=mid-1;
            }
            else if(arr[mid]<x)
            {
                lo=mid+1;
            }
            else
            {
                if(mid==0 || arr[mid-1]!=arr[mid])
                return mid;
                else
                hi=mid-1;
            }
        }
        return -1;
    }
    public long lastOcc(long arr[], long x)
    {
        int lo=0,hi=arr.length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]>x)
            {
                hi=mid-1;
            }
            else if(arr[mid]<x)
            {
                lo=mid+1;
            }
            else
            {
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
                return mid;
                else
                lo=mid+1;
            }
        }
        return -1;
    }
}