class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int x=0;
        for(int i=0;i<operations.length;i++){
          String str=operations[i];
          if(str.equals("X++")==true || str.equals("++X")==true)
            x++;
          else
            x--;
        }
      return x;
    }
}