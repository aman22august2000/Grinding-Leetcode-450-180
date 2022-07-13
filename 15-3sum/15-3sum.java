class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
                continue;
            
            int lo=i+1;
            int hi=n-1;
            while(lo<hi)
            {
                int sum=nums[i]+nums[lo]+nums[hi];
                if(sum==0)
                {
                    ArrayList<Integer> row=new ArrayList<Integer>();
                    row.add(nums[i]);
                    row.add(nums[lo]);
                    row.add(nums[hi]);
                    ls.add(row);
                    
                    while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                    while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                    lo++;
                    hi--;
                }
                else if(sum<0) lo++;
                else if(sum>0) hi--;
            }
        }
        return ls;
    }
}