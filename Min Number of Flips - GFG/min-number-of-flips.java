//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.minFlips(S));
                        
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    public int minFlips(String S) {
        // Code here
        int cnt1=0, cnt2=0;
        int l=S.length();
        return Math.min(zeroStart(S,l),oneStart(S,l));
    }
    public int zeroStart(String S,int l)
    {
        char init='0';
        int cnt=0;
        for(int i=0;i<l;i++)
        {
            if(i%2==0)
            {
                if(S.charAt(i)!=init)
                cnt++;
            }
            else
            {
                if(S.charAt(i)==init)
                cnt++;
            }
        }
        return cnt;
    }
    public int oneStart(String S,int l)
    {
        char init='1';
        int cnt=0;
        for(int i=0;i<l;i++)
        {
            if(i%2==0)
            {
                if(S.charAt(i)!=init)
                cnt++;
            }
            else
            {
                if(S.charAt(i)==init)
                cnt++;
            }
        }
        return cnt;
    }
}