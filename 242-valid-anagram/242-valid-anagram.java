class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> list1=new ArrayList<>();
        List<Character> list2=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            list1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            list2.add(t.charAt(i));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)) return true;
        else return false;
    }
}