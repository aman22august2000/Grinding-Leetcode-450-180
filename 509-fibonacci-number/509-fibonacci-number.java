class Solution {
    public int fib(int n) {
        double sqrt5 = Math.sqrt(5);
        return (int)((Math.pow(1 + sqrt5, n) - Math.pow(1 - sqrt5, n)) / (double)Math.pow(2, n) / sqrt5);
    }
}