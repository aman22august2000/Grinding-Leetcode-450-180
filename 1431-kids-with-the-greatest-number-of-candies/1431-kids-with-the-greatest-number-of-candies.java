class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      ArrayList<Boolean> result=new ArrayList<Boolean>(candies.length);
      int mx=-1;
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i]>mx)
        {
          mx=candies[i];
        }
      }
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i]+extraCandies>=mx)
        {
          result.add(true);
        }
        else
        {
          result.add(false);
        }
      }
      return result;
    }
}