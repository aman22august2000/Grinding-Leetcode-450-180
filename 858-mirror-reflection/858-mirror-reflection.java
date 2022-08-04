class Solution {
    public int mirrorReflection(int p, int q) {
        int ans=-1;
        while(p%2==0 && q%2==0)
        {
            p/=2;
            q/=2;
        }
        if(p%2==1 && q%2==0) ans=0;
        if(p%2==0 && q%2==1) ans=2;
        if(p%2==1 && q%2==1) ans=1;
        return ans;
    }
}