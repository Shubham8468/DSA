class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row=mat.length,
        col=mat[0].length;
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<row;i++){
            int soldires=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    break;
                }
                soldires+=1;
            }
            list.add(new int [] {
                soldires,
                i
            });
        }
        // app list ko short krna tha on the bassase of number of soldires
        Collections.sort(list, (e1,e2)-> {
            if(e1[0]==e2[0]){  // in case soldires quals ho to index ke base pe short krna hai
                return e1[1]-e2[1];
            }
            return e1[0]-e2[0];
        });
        
        // list short ho gyi hai ab bs return kr to k thk
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)[1];
        }
        return res;
    }
}