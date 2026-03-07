class Solution {
    public void bfs(int i, int[][] ajt, boolean[] vist,int n){
      vist[i]=true;
      for(int j= 0;j<n;j++){
        if(ajt[i][j]==1 && !vist[j]){
            bfs(j,ajt,vist,n);// this the the recursion method for the sovle this problem
        }
      }
    }
    public int findCircleNum(int[][] ajt) {
        int n=ajt.length;
        int count=0;
        boolean[] vist= new boolean[n];
        for(int i= 0;i<n;i++){
            if(!vist[i]){
                bfs(i,ajt,vist,n);
                count++;
            }
        }
        return count;
    }
}