class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        //create distance array and set them to MAX_VALUE except the starting node K to 0.
        int[] dist = new int[N+1];
        for(int i=1; i<dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[K] = 0;
        
        //try to relax all the edges
        for(int i=1; i<N; i++) {
            for(int[] edge: times) {
                int source = edge[0];
                int dest = edge[1];
                int weight = edge[2];
                if(dist[source]!=Integer.MAX_VALUE && dist[source] + weight < dist[dest]) {
                    dist[dest] = dist[source] + weight;
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        // check to see if any of the distances are MAX_VALUE, this will
        // show that the node was never relaxed so return -1
        for(int i=0; i<dist.length; i++) {
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            max = Math.max(max, dist[i]);
        }
        
        return max;
    }
}