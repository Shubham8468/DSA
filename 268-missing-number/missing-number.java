class Solution {
    public int missingNumber(int[] arr) {
       int n= arr.length;
        HashSet<Integer> set= new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    } 
    }
