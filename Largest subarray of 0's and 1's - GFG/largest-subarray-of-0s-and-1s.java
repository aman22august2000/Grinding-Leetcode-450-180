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
    int maxLen(int[] arr, int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        
        int mx_len=0;
        int end_idx=-1;
        int st_idx=0;
        
        for(int i=0;i<n;i++)
        {
            arr[i]= (arr[i]==0) ? -1 : 1;
        }
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            
            if(sum==0)
            {
                mx_len=i+1;
                end_idx=i;
            }
            if(hm.containsKey(sum))
            {
                if(mx_len<i-hm.get(sum))
                {
                    mx_len=i-hm.get(sum);
                    end_idx=i;
                }
            }
            else
            hm.put(sum,i);
        }
        
        for(int i=0;i<n;i++)
        {
            arr[i]=(arr[i]==-1)?0:1;
        }
        
        return mx_len;
    }
}
