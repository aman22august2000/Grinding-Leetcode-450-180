//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int m, int n)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        int t=0,b=m-1,l=0,r=n-1;
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            ans.add(matrix[t][i]);
            t++;
            
            for(int i=t;i<=b;i++)
            ans.add(matrix[i][r]);
            r--;
            
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                ans.add(matrix[b][i]);
                b--;
            }
            
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                ans.add(matrix[i][l]);
                l++;
            }
        }
        return ans;
    }
}
