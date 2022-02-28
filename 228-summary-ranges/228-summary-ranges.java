class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> str=new ArrayList<String>();
        if(nums.length==0)
            return str;
        int count=0,i=0,j;
        
        for(j=1;j<nums.length;j++)
        {
            // for(int j=i+1;j<nums.length;j++)
            // {
            
                if(nums[j-1]+1!=nums[j])
                {
                    if(i<j-1)
                    {
                        str.add(nums[i]+"->"+nums[j-1]);
                        i=j;
                        
                    }
                    else
                    {
                        int p=nums[i];
                        str.add(Integer.toString(p));
                        i=j;
                    }
                    
                }
            
            // }
        }
        if(i<j-1)
                    {
                        str.add(nums[i]+"->"+nums[j-1]);
                        
                        
                    }
                    else
                    {
                        int p=nums[i];
                        str.add(Integer.toString(p));
                        
                    }
        return str;
    }
}