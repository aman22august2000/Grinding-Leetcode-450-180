class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        char str1[]=s.toCharArray();
        char str2[]=t.toCharArray();
        
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        for(int i=0;i<s.length();i++)
        {
            if(str1[i]!=str2[i])
                return false;
        }
        
        // int ans=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     ans=ans^s.charAt(i)^t.charAt(i);
        // }
        // if(ans!=0)
        //     return false;
        
        return true;
    }
}