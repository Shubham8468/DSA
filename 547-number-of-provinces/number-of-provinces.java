class Solution {
    public void bfs(int i, int[][] ajt, boolean[] vist){
        int n= ajt.length;
        Queue<Integer> q= new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.remove();
            for(int j= 0;j<n;j++){
             if(ajt[front][j]==1 && vist[j]==false){
                q.add(j);
                vist[j]=true;

             }
            }
            
        }
    }
    public int findCircleNum(int[][] ajt) {
        int n=ajt.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i= 0;i<n;i++){
            if(!vist[i]){
                bfs(i,ajt,vist);
                count++;
            }
        }
        return count;
    }
}