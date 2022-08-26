class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        String s1="";
        String s2="";
        for(String word: word1)
            // sb1.append(word);
            s1=s1+word;
        
        for(String word: word2)
            // sb2.append(word);
            s2=s2+word;
        
        return s1.equals(s2);
    }
}
