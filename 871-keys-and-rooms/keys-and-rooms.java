class Solution {
    public void dfs(int node,List<List<Integer>> adj,boolean[] vist,int n){
        vist[node]=true;
        for(int keys:adj.get(node)){
            if(!vist[keys]){
                dfs(keys,adj,vist,n);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj ) {
        int n=adj.size();
        boolean[] vist= new boolean[n];
        dfs(0,adj,vist,n);
        for(boolean ans:vist){
            if(ans==false){
                return false;
            }
        }
        return true;
    }
}