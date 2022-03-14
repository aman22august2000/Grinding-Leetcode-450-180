class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int mx=releaseTimes[0];
      char ch=keysPressed.charAt(0);
      for(int i=1;i<releaseTimes.length;i++)
      {
        int diff=releaseTimes[i]-releaseTimes[i-1];
        if(diff>=mx)
        {
          if(diff>mx)
            ch=keysPressed.charAt(i);
          else if(diff==mx)
            ch=(char)Math.max((int)ch,(int)keysPressed.charAt(i));
          mx=diff;
        }
      }
      return ch;
    }
}