class Solution {
    public int minimumEffortPath(int[][] heights) {
      int n=heights.length;
      int m=heights[0].length;
      
      int [][] coord=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
      
      int diff[][]=new int[n][m];
      for(int[] arr:diff)
      {
        Arrays.fill(arr,Integer.MAX_VALUE);
      }
      
      Queue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
      pq.add(new int[]{0,0,0});
      while(!pq.isEmpty())
      {
        int[] counter=pq.poll();
        if(counter[0] == n-1 && counter[1] == m-1)
          return counter[2];
        
        for(int k=0;k<coord.length;k++)
        {
          int a=counter[0]+coord[k][0];
          int b=counter[1]+coord[k][1];
          if(a>=0 && a<n && b>=0 && b<m)
          {
            int currDist=Math.max(counter[2],Math.abs(heights[a][b]-heights[counter[0]][counter[1]]));
            if(diff[a][b] > currDist)
            {
              diff[a][b]=currDist;
              pq.add(new int[]{a,b,currDist});
            }
          }
        }
      }
      return -1;
    }
}