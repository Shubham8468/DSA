class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lossCount = new HashMap<>();
        List<Integer> notLost  = new ArrayList<>();
        List<Integer> lostOne  = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Record every player (winner and loser) with their loss count
        for (int[] match : matches) {
            int winner = match[0];
            int loser  = match[1];
            lossCount.putIfAbsent(winner, 0);          // winner: 0 losses (if not already present)
            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
        }

        // Step 2: Check each player's loss count
        for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
            if (entry.getValue() == 0) {
                notLost.add(entry.getKey());   // never lost
            } else if (entry.getValue() == 1) {
                lostOne.add(entry.getKey());   // lost exactly once
            }
        }

        // Step 3: Sort both lists (problem requires sorted order)
        Collections.sort(notLost);
        Collections.sort(lostOne);

        ans.add(notLost);
        ans.add(lostOne);
        return ans;
    }
}