class Solution {
   public int[] dailyTemperatures(int[] temperatures) {
        //[73,74,75,71,69,72,76,73]
        int n= temperatures.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>(); // we store idx only 
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty()){ // here we find the next greter
                ans[i]=st.peek()-i;
            }
            st.push(i);

        }
        return ans;
    }
}