class Solution {
    public int titleToNumber(String str) {
        
        int l=str.length();
        int sum=(int)str.charAt(0)-64;        
        for(int i=1;i<l;i++)
        {
            char ch=str.charAt(i);
            int n=(int) ch-64;
            sum=n+(sum*26);
        }
        return sum;
    }
}