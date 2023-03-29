//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int n)
    {
        // your code here
        if(n==1)
        return arr[0];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                int cnt=mp.get(arr[i])+1;
                if(cnt>arr.length/2)
                return arr[i];
                else
                mp.put(arr[i],cnt);
            }
            else
            mp.put(arr[i],1);
        }
        return -1;
    }
}