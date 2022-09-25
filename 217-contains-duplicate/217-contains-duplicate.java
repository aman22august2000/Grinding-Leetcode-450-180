class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        if(set.size()==nums.length) return false;
        else return true;
    }
}