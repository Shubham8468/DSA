class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
       int n= matrix.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(pq.size() <k){
                pq.add(matrix[i][j]);
            }
            else{
                if(matrix[i][j] < pq.peek()){
                    pq.poll();
                    pq.add(matrix[i][j]);
                }
            }
        }
       }
       return pq.peek();
    }
}