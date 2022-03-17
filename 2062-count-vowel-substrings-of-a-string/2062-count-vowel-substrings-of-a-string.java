class Solution {
    public int countVowelSubstrings(String word) {
      int count = 0;
        Map<Character, Integer> lastSeen =
            new HashMap<>(Map.of('a', -1, 'e', -1, 'i', -1, 'o', -1, 'u', -1));
        for (int i = 0, lastInvalidPos = -1; i < word.length(); ++i) {
            if (lastSeen.containsKey(word.charAt(i))) {
                lastSeen.put(word.charAt(i), i);
                count += Math.max(Collections.min(lastSeen.values()) - lastInvalidPos, 0);
            } else {
                lastInvalidPos = i;
            }
        }
        return count;
    }
}