class Solution {
    public int countEven(int n) {
      return (String.valueOf(n).chars().map(Character::getNumericValue).sum() % 2 == 0) ? n / 2: (n - 1) / 2;
    }
}