class Solution {
    public int[] findOriginalArray(int[] A) {
        int n=A.length,i=0;
        if(n%2==1)
            return new int[0];
        int ans[]=new int[n/2];
        Map<Integer,Integer> map=new TreeMap<>();
        for(int a:A)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int x:map.keySet())
        {
            if(map.get(x)>map.getOrDefault(x+x,0))
                return new int[0];
            for(int j=0;j<map.get(x);++j)
            {
                ans[i++]=x;
                map.put(x+x,map.get(x+x)-1);
            }
        }
        return ans;
    }
}