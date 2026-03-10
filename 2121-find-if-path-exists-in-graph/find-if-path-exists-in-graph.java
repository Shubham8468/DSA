class Solution {
  public void dfs(int start, List<List<Integer>> adj,boolean[] vist){
        vist[start]=true;
        for(int ele: adj.get(start)){
            if(!vist[ele]){
                dfs(ele,adj,vist);
            }
        }
    }
public boolean validPath(int n, int[][] edges, int start, int end) {
// make a adj list than apply DFS or BFS
    List<List<Integer>> adj= new ArrayList<>();
    boolean[] vist= new boolean[n];
    if(start==end){
        return true;
    }
    for (int i = 0; i < n; i++) {
        List<Integer> list= new ArrayList<>();
        adj.add(list);
    }
    // add item in that
    for (int i = 0; i < edges.length; i++) {
        int a=edges[i][0] , b=edges[i][1];
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    dfs(start,adj,vist);
    return vist[end];

}
}