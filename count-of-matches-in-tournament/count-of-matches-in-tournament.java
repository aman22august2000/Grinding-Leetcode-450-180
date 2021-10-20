class Solution {
    public int numberOfMatches(int n) {
        int rem, sum=0;
        while(n>1)
        {
            if(n%2==0)
            {
                rem=n/2;
                sum+=rem;
                n/=2;
            }
            else
            {
                rem=n/2;
                sum+=rem;
                n=n-(n/2);
            }
        }
        return sum;
    }
}