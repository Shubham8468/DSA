class Solution {
    public int minStoneSum(int[] piles, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int sum = 0;

    for (int ele : piles) {
        pq.add(ele);
        sum += ele;
    }

    for (int i = 1; i <= k; i++) {
        int top = pq.poll();
        int remove = top / 2;   // how many stones to remove
        sum -= remove;
        pq.offer(top - remove); // put back remaining stones
    }

    return sum;
}
}