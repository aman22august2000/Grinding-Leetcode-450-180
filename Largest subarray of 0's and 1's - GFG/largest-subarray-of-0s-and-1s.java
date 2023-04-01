//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
        // Your code here
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            sum += -1;
            else if(arr[i]==1)
            sum += +1;
            
            if(mp.containsKey(sum))
            {
                int idx=mp.get(sum);
                int len=i-idx;
                if(len>ans)
                ans=len;
            }
            else
            {
                mp.put(sum,i);
            }
        }
        return ans;
    }
}
