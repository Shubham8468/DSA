class Solution {
   public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n= adj.size();
        boolean[] vist= new boolean[n];
        vist[0]=true; // this are the 1st Room that are be Open o key required. Entry point so the its will be true by default
        bfs(0,adj,vist);
        for(boolean ans: vist){
            if(ans==false){
                return false;
            }
        }
        return true;
    }
    public void bfs(int start, List<List<Integer>> adj, boolean[] vist){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            int front=q.remove();
            for(int ele : adj.get(front)){
                if(!vist[ele]){
                    q.add(ele);
                    vist[ele]=true;
                }
            }
        }

    }
}