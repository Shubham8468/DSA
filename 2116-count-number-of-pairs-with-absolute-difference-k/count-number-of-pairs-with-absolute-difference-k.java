class Solution {
    public int countKDifference(int[] arr, int k) {
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int ele : arr){
        map.put(ele,map.getOrDefault(ele,0)+1);
      }
      int pairs=0;
      for(int ele : map.keySet()){
        int rem1=ele-k;
        int rem2=ele+k;
        if(map.containsKey(rem1)) {
            pairs+= (map.get(rem1)*map.get(ele));
        }
        if(map.containsKey(rem2)){
            pairs+= (map.get(rem2)* map.get(ele));
        }
      }  
       pairs/=2;
       return pairs;
    }
}