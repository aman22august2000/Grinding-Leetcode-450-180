class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l=cost.length;
        for(int i=2;i<l;i++)
        {
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[l-1],cost[l-2]);
    }
}