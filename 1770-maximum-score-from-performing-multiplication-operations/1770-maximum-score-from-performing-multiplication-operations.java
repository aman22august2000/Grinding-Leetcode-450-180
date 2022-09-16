// class Solution {
//     public int maximumScore(int[] nums, int[] mult) {
//         Arrays.sort(nums);
//         Arrays.sort(mult);
//         int i=0,j=nums.length-1,k=0,l=mult.length;
//         int prod=1,sum=0;
//         while(i<j && k<l)
//         {
//             if(nums[i]<0 && mult[i]<0)
//             {
//                 prod=nums[i++]*mult[k++];
//             }
//             else if(nums[i]<0 && mult[i]>0)
//             {
                
//             }
//             else if(nums[i]<0 && mult[i]<0)
//         }
//     }
// }
class Solution {
    int n, m;
    Integer[][] dp;
    public int maximumScore(int[] nums, int[] multipliers) {
        n = nums.length;
        m = multipliers.length;        
        
        dp = new Integer[1001][1001];
        return helper(0, 0, nums, multipliers);
    }
    
    private int helper(int i, int j, int[] nums, int[] mul) {
        if( i== m )return 0;
        if( dp[i][j] != null ) return dp[i][j]; 
        var left= mul[i]*nums[j] + helper(i+1, j+1, nums, mul);        
        var right = mul[i]*nums[n-1 -(i-j)] + helper(i+1, j, nums, mul);
        return dp[i][j] = Math.max(left, right);
    }
}