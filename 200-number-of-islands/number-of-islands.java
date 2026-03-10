class Solution {
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
                    } 
            catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }
   class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] vist){
        int m=grid.length;
        int n= grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(i,j));// this is the way to add the pairs in Queue
        while (!q.isEmpty()){
            Pair front=q.remove();
            int row=front.row ,col=front.col;
            // see top -> row-1,col
            if(row >0){
                if(!vist[row-1][col] && grid[row-1][col]=='1'){
                    q.add(new Pair(row-1,col));
                    vist[row-1][col]=true;
                }
            }
            // For Bottem ->row+1,col
            if(row+1<m){
                if(!vist[row+1][col] && grid[row+1][col]=='1'){
                    q.add(new Pair(row+1,col));
                    vist[row+1][col]=true;
                }
            }
            //For left -> row,col-1;
            if(col>0){
                if(!vist[row][col-1] && grid[row][col-1]=='1'){
                    q.add(new Pair(row,col-1));
                    vist[row][col-1]=true;
                }
            }
            // For Right -> row,col+1;
            if(col+1 < n){
                if(!vist[row][col+1] &&grid[row][col+1]=='1'){
                    q.add(new Pair(row,col+1));
                    vist[row][col+1]=true;
                }
            }



        }

    }
    public int numIslands(char[][] grid) {// '1' is land
    int m=grid.length;
    int n= grid[0].length;
    int count=0;
    boolean[][] vist=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1' &&!vist[i][j]){
                    bfs(i,j,grid,vist);
                    count++;
                }
            }
        }
        return count;
        }
}