class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int i,j,l,m;
        for(i=len;i>=0;i--)
        {
            for(j=0;j<len-i;j++)
            {
                l=j;
                m=j+i;
                while(s.charAt(l)==s.charAt(m))
                {
                    l++;
                    m--;
                    if(l>=m)
                    {
                        return (String)s.subSequence(j,j+i+1);
                    }
                }
            }
        }
        return ""+s.charAt(0);
    }
}