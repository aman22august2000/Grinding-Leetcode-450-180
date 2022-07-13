/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int [n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int lo=0,hi=n-1;
		    while(lo<hi)
		    {
		        int temp=arr[lo];
		        arr[lo]=arr[hi];
		        arr[hi]=temp;
		        lo++;
		        hi--;
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
	static void reverseArray(int arr[],int start,int end)
	{
	    int temp;
	    if(start>=end)
	        return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
	}
}