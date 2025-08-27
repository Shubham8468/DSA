class Solution {
    public int singleNonDuplicate(int[] nums) {
        Stack<Integer> s=new Stack<>();
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<=nums.length-1;i++){
            s.push(nums[i]);
            if(i==nums.length-1){
                return nums[i];
            }
            if(s.peek()==nums[i+1]){
                i=i+1;
            }
            else{
                return nums[i];
            }

        }
        return -1;
    }
}