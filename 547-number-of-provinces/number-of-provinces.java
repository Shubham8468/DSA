class Solution {
    public void bfs(int node,int[][] adj,boolean[] vist,int n){
        vist[node]=true;
        Queue<Integer> q= new LinkedList<>();
        q.add(node);
        while(q.size()>0){
            int font=q.remove();
            for(int j=0;j<n;j++){
                if(adj[font][j]==1 && !vist[j]){
                    q.add(j);
                    vist[j]=true;
                }
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