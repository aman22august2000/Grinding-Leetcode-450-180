class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='X' || s.charAt(i)=='V')
            {
                if(i>0 && s.charAt(i-1)=='I')
                    sum-=2;
            }
            if(s.charAt(i)=='L' || s.charAt(i)=='C')
            {
                if(i>0 && s.charAt(i-1)=='X')
                    sum-=20;
            }
            if(s.charAt(i)=='D' || s.charAt(i)=='M')
            {
                if(i>0 && s.charAt(i-1)=='C')
                    sum-=200;
            }
            sum+=mp.get(s.charAt(i));
        }
        return sum;
    }
}