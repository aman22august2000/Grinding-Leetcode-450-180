class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer> map=new HashMap();
        for(String str:words)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int ans=0;
        char ch[]=s.toCharArray();
        for(String str:map.keySet())
        {
            int i=0,j=0;
            char temp[]=str.toCharArray();
            while(i<ch.length && j<temp.length)
            {
                if(ch[i]==temp[j])
                {
                    i++;
                    j++;
                }
                else
                    i++;
            }
            if(j==temp.length)
                ans+=map.get(str);
        }
        return ans;
    }
}