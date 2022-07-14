class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int alp[]=new int[26];
        char cs[]=s.toCharArray();
        char ct[]=t.toCharArray();
        int count=0;
        for(int i=0;i<cs.length;i++)
        {
            if(++alp[cs[i]-'a']==1) count++;
            if(--alp[ct[i]-'a']==0) count--;
        }
        return count==0;
    }
}