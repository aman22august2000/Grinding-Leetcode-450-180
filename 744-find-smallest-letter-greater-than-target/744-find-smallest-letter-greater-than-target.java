class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
      char res=letters[0];
      int lo=0;
      int hi=letters.length-1;
      
      while(lo<=hi)
      {
        int mid=lo+(hi-lo)/2;
        if(letters[mid]==target)
        {
          lo=mid+1;
        }
        else if(target>letters[mid])
        {
          lo=mid+1;
        }
        else if(letters[mid]>target)
        {
          res=letters[mid];
          hi=mid-1;
        }
      }
      return res;
    }
}