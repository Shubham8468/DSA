class Solution {
    public int countKDifference(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele : arr){
           map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int pair=0;
        for(int ele : map.keySet()){
            int rem1=ele-k;
            int rem2=ele+k;
            if(map.containsKey(rem1)) pair+=(map.get(ele)* map.get(rem1));
             if(map.containsKey(rem2)) pair+=(map.get(ele)* map.get(rem2));
        }
        pair/=2;
        return pair;
    }
}