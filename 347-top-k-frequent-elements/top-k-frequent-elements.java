class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> fre= new HashMap<>();
    int[] ans= new int[k];
    for(int ele : nums){
        fre.put(ele ,fre.getOrDefault(ele ,0)+1);
    }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b) ->
                fre.get(b)-fre.get(a));

       pq.addAll(fre.keySet());

        for (int i = 0; i < k; i++) {
            int item= pq.poll();
            ans[i]=item;
        }
        return ans;

    }
}