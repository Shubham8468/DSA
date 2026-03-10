class Solution {
    public void bfs(int node,int[][] adj,boolean[] vist,int n){
        vist[node]=true;
        for(int j=0;j<n;j++){
            if(adj[node][j]==1 &&!vist[j]){
              
                bfs(j,adj,vist,n);
                 
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i=0;i<n;i++){
            if(!vist[i]){
                bfs(i,isConnected,vist,n);
                count++;
            } 
        }
        return count;
    }
}