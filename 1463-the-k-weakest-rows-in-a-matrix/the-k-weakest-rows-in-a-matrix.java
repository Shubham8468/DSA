class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result=new int[k];
        int rows=mat.length;
        int cols=mat[0].length;
      PriorityQueue<int[]> pq = new PriorityQueue<>((e1,e2)->{
        if(e1[0]-e2[0]==0){
            // it this case we compaire with indexes
            return e2[1]-e1[1];
        }
        return e2[0]-e1[0];
      });
        for(int row=0;row<rows;row++){
            int sol=0;
            for(int col=0;col<cols;col++){
              if(mat[row][col]==0){
                break;
              }
              sol=sol+1;
            }
            pq.add(new int[] {
                sol,
                row
            });
        }
        while(pq.size()>k){
          pq.poll();
        }
        for(int i=k-1;i>=0;i--){
            result[i]=pq.poll()[1];
        }
        return result;
    }
}