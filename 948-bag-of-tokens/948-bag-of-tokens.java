class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=tokens.length;
        int i=0,j=l-1;
        int score=0,points=0;
        while(i<=j)
        {
            if(power>=tokens[i])
            {
                power=power-tokens[i++];
                score=Math.max(score,++points);
            }
            else if(points>0)
            {
                points--;
                power=power+tokens[j--];
            }
            else
            {
                break;
            }
        }
        return score;
    }
}