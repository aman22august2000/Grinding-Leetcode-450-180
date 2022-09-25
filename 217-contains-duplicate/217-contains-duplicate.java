class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.get(x)==null ? 1 : map.get(x)+1);
        }
        for(int val:map.values())
        {
            if(val>1)
                return true;
        }
        return false;
    }
}