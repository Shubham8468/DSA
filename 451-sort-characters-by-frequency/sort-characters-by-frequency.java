class Solution {
    public String frequencySort(String s) {

       
        Map<Character, Integer> fre = new HashMap<>();

        for (char ch : s.toCharArray()) {
            fre.put(ch, fre.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Character> maxHeap =
            new PriorityQueue<>((a, b) -> fre.get(b) - fre.get(a));

        
        maxHeap.addAll(fre.keySet());

       
        StringBuilder ans = new StringBuilder();

        while (!maxHeap.isEmpty()) {

            char ch = maxHeap.poll();

            int count = fre.get(ch);

            
            while (count > 0) {
                ans.append(ch);
                count--;
            }
        }

        return ans.toString();
    }
}