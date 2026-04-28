class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int ele : nums){
            pq.add(ele);
        }
        int n=pq.size();
        for(int i=0;i<n;i++){

          nums[i]=pq.remove();
        }
        return nums;
    }
}