class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int val=100000,freq=0;
        for(int i:nums)
        {
            if(i%2==0)
            {
                int curr=mp.getOrDefault(i,0)+1;
                mp.put(i,curr);
                if(curr>freq || curr==freq && i<val)
                {
                    val=i;
                    freq=curr;
                }
            }
        }
        return freq==0?-1:val;
    }
}