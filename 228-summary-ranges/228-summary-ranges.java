class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> str=new ArrayList<String>();
        if(nums.length==0)
            return str;
        int count=0,i=0,j;
        
        for(j=0;j<nums.length-1;j++)
        {
            // for(int j=i+1;j<nums.length;j++)
            // {
            
                if(nums[j]+1!=nums[j+1])
                {
                    if(i<j)
                    {
                        str.add(nums[i]+"->"+nums[j]);
                        i=j+1;
                        
                    }
                    else
                    {
                        int p=nums[i];
                        str.add(Integer.toString(p));
                        i=j+1;
                    }
                    
                }
            
            // }
        }
        if(i<j)
                    {
                        str.add(nums[i]+"->"+nums[j]);
                        
                        
                    }
                    else
                    {
                        int p=nums[i];
                        str.add(Integer.toString(p));
                        
                    }
        return str;
    }
}