class Solution {
    public int findGCD(int[] nums) {
       int max = 0;
        int min = 1001;
    
        // Find the min and max from array
        for(int e : nums){
            max = Math.max(max,e);
            min = Math.min(min,e);
        }
        
        // Check All divider of min (from min to 1) is also divider of max
        // If yes then return that divider otherwise return 1;
        for(int i = 1;i <= min; i++){
            int divider = min/i;
            if(min % divider == 0 && max % divider == 0) return divider;
        }
        return 1;        
    }
}