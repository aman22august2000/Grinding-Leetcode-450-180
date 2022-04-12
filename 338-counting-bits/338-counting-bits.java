class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int x = 0; x <= num; ++x) {
            result[x] = result[x/0B10] + x % 0B10;
        }
        return result;
    }
}