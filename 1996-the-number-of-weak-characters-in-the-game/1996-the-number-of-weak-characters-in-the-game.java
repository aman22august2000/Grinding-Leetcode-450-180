class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int l=properties.length;
        
        Arrays.sort(properties,(a,b)->(b[0]==a[0]?a[1]-b[1]:b[0]-a[0]));
        
        int cnt=0;
        int max=0;
        for(int i=0;i<l;i++)
        {
            if(properties[i][1]<max)
            {
                cnt++;
            }
            max=Math.max(max,properties[i][1]);
        }
        return cnt;
    }
}