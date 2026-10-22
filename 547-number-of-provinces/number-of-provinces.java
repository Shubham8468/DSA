class Solution {
     public void bfs(int i,int[][] adj,boolean[] vist){
      vist[i]=true;
      int n= adj.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while (q.size()>0){
            int front=q.remove();
            for (int j = 0; j < n; j++) {
                if(adj[front][j]==1 && !vist[j]){
                    q.add(j);
                    vist[j]=true;
                }
                
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean[] visted=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visted[i]){
                bfs(i,isConnected,visted);
                count++;
            }
        }
        return count;
    }
}