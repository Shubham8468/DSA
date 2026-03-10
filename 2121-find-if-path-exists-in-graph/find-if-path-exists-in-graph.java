class Solution {
    public void bfs(int n,  List<List<Integer>> adj,int a , int b, boolean[] vist){
        Queue<Integer> q= new LinkedList<>();
        q.add(a);
        while (!q.isEmpty()){
            int front= q.remove();
            for(int ele:adj.get(front)){
                if(!vist[ele]){
                    q.add(ele);
                    vist[ele]=true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] vist= new boolean[n];
        if(start==end)return true;
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list= new ArrayList<>();
            adj.add(list);// add Empthy list
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0] , b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        vist[start]=true;
        bfs(n,adj,start,end,vist);
        
        return vist[end];

    }
}