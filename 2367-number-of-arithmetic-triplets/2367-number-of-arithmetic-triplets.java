class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set=new HashSet<>();
        int cnt=0;
        for(int num:nums)
        {
            if(set.contains(num-diff) && set.contains(num-2*diff))
                cnt++;
            set.add(num);
        }
        return cnt;
    }
}