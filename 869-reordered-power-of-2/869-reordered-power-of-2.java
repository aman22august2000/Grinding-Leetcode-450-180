class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s=Integer.toString(n);
        int[] a=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            a[i]=s.charAt(i)-'0';
        }
        return permutations(a,0);
    }
    public boolean isPowerOfTwo(int[]a)
    {
        if(a[0]==0) return false;
        int n=0;
        for(int x:a)
        {
            n=n*10+x;
        }
        while(n%2==0)
        {
            n/=2;
        }
        return n==1;
    }
    public boolean permutations(int []a,int start)
    {
        if(start==a.length)
            return isPowerOfTwo(a);
        
        for(int i=start;i<a.length;i++)
        {
            swap(a,start,i);
            
            if(permutations(a,start+1))
                return true;
            
            swap(a,start,i);
        }
        return false;
    }
    public void swap(int []a,int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}