class Solution {
        public void gameOfLife(int[][] board) {
        int[][] dir = {{1, -1}, {1, 0}, {1, 1}, {0, -1}, {0, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;
                //8 directions to search
                for (int[] d : dir) {
                    //Array cannot out of bounds
                    if (d[0] + i < 0 || d[0] + i >= m || d[1] + j < 0 || d[1] + j >= n)
                        continue;
                    //Count the number of living
                    if (board[d[0] + i][d[1] + j] == 1 || board[d[0] + i][d[1] + j] == 2)
                        live++;
                }
                //4，dead cell resurrection
                if (board[i][j] == 0 && live == 3)
                    board[i][j] = 3;
                // 1,3，living cell death
                if (board[i][j] == 1 && (live < 2 || live > 3))
                    board[i][j] = 2;
                //2, living cells are still alive
            }
        }

        /**
         * board[i][j]==0  died
         * board[i][j]==1  lived
         * board[i][j]==2  death
         * board[i][j]==3  lived
         */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}