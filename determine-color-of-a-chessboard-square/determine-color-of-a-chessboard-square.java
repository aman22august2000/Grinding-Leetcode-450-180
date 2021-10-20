class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch1=coordinates.charAt(0);
        char ch2=coordinates.charAt(1);
        int p=(int)ch1;
        int q=(int)ch2-96;
        if(p-q==0)
            return false;
        else if(Math.abs(p-q)%2==0)
            return false;
        else
            return true;
    }
}