class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Boolean> mp=new HashMap<>();
        for(String s:arr)
        {
            if(mp.containsKey(s))
                mp.put(s,false);
            else
                mp.put(s,true);
        }
        int cnt=0;
        for(String item:arr)
        {
            if(mp.get(item)==true)
            {
                cnt++;
                if(k==cnt)
                    return item;
            }
        }
        return "";
    }
}