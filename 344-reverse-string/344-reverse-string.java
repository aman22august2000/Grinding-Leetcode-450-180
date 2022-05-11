class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        solve(s, i);
    }
    public void solve(char[] s, int i){
        int l=s.length;
        if(i >= l/2) return;
        char temp = s[i];
        s[i] = s[l-i-1];
        s[l-i-1] = temp;
        solve(s, ++i);
    }
}