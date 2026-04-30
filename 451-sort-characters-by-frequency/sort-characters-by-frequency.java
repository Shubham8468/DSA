class Solution {
    public String frequencySort(String s) {

        // Step 1: Store frequency
        Map<Character, Integer> fre = new HashMap<>();

        for (char ch : s.toCharArray()) {
            fre.put(ch, fre.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create Max Heap based on frequency
        PriorityQueue<Character> maxHeap =
            new PriorityQueue<>((a, b) -> fre.get(b) - fre.get(a));

        // Step 3: Add all characters into heap
        maxHeap.addAll(fre.keySet());

        // Step 4: Build answer
        StringBuilder ans = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            char ch = maxHeap.poll();

            int count = fre.get(ch);

            // append character count times
            while (count > 0) {
                ans.append(ch);
                count--;
            }
        }

        return ans.toString();
    }
}