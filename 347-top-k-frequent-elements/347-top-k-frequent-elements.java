public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nToCountMap = new HashMap<>();
        for(int n : nums) {
            int count = nToCountMap.getOrDefault(n, 0) + 1;
            nToCountMap.put(n, count);
        }

        return nToCountMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(k)
                .mapToInt(n -> n)
                .toArray();
    }
}