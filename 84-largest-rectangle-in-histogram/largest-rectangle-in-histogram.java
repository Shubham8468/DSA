class Solution {
   public int largestRectangleArea(int[] heights) {
        // fins psm && nsm
        int n=heights.length;
        int[] nsm= new int[n];
        int[] psm=new int[n];
        Stack<Integer> st= new Stack<>();
        // For the next smallest
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsm[i]=n;
            }
            else {
                nsm[i]=st.peek();
            }
            st.push(i);
        }
        // NOw we find psm
        // fist Empty stack
        while (!st.isEmpty()){
            st.pop();
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                psm[i]=-1;
            }
            else{
                psm[i]=st.peek();
            }
            st.push(i);
        }

        int largest=-1;
        for(int i=0;i<n;i++){
            int area= heights[i] *(nsm[i]-psm[i]-1);
            largest=Math.max(largest,area);
        }
        return largest;


    }

}