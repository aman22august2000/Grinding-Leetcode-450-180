class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
      
        if (mat == null || k < 0 || mat.length < k) {
            throw new IllegalArgumentException("Input is invalid");
        }
        if (k == 0) {
            return new int[0];
        }
      
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[k];
        int idx = 0;

        for (int j = 0; j <= cols; j++) {
            for (int i = 0; i < rows; i++) {
                if ((j == cols || mat[i][j] == 0) && (j == 0 || mat[i][j - 1] == 1)) {
                    result[idx++] = i;
                    if (idx == k) {
                        return result;
                    }
                }
            }
        }
      return result;
    }
}