class Solution {
    public void bfs(int node,List<List<Integer>> adj,boolean[] vist,int n){
        Queue<Integer> q= new LinkedList<>();
        q.add(node);
        vist[node]=true;
        // vist[node]=true;
        while(!q.isEmpty()){
            int start= q.remove();
            for(int neve : adj.get(start)){
                if(!vist[neve]){
                     vist[neve]=true;
                    q.add(neve);
                   
                }
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> adj ) {
        int n=adj.size();
        boolean[] vist= new boolean[n];
        bfs(0,adj,vist,n);
        for(boolean ans:vist){
            if(ans==false){
                return false;
            }
        }
        return true;
    }
}