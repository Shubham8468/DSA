class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Count frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int value : arr) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Check if all frequencies are unique
        HashSet<Integer> frequencySet = new HashSet<>(frequencyMap.values());
        return frequencySet.size() == frequencyMap.size();
    }
}