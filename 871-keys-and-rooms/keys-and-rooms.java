class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {

   int n=adj.size();
   boolean[] vist=new boolean[n];
  vist[0]=true;
  bfs(0,adj,vist);
  for(boolean ele:vist){
      if(ele==false){
          return false;
      }
  }
  return true;
}
public void bfs(int i,List<List<Integer>> adj,boolean[] vist){
    Queue<Integer> q=new LinkedList<>();
    q.add(i);
    while (q.size()>0){
        int front=q.remove();
        for(int ele:adj.get(front)){
            if(vist[ele]==false){
                vist[ele]=true;
                q.add(ele);
            }
        }
    }
}
}