//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> pos=new ArrayList<>();
        int l=0;
        int r=0;
        
        int preSum=arr[0];
        boolean isFound=false;
        
        if(s==0)
        {
            pos.add(-1);
            return pos;
        }
        
        while(r<n)
        {
            if(preSum==s)
            {
                isFound=true;
                break;
            }
            else if(preSum<s)
            {
                r++;
                if(r<n) preSum+=arr[r];
            }
            else
            {
                preSum-=arr[l];
                l++;
            }
        }
        
        if(isFound)
        {
            pos.add(l+1);
            pos.add(r+1);
            return pos;
        }
        
        pos.add(-1);
        return pos;
    }
}