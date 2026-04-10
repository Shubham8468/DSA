class Solution {
   public int largestRectangleArea(int[] heights) {
        // find psn -> Previous Smaller Element
        // find nsm -> Next Smaller Element
        int n=heights.length;
        int[] nse= new int[n];
        int[] pse=new int[n];
        Stack<Integer> st= new Stack<>();
        // For the next smallest
        for(int i=n-1;i>=0;i--){
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else {
                nse[i]=st.peek();
            }
            st.push(i);
        }
        // NOw we find pse
        // fist Empty stack
        while (!st.isEmpty()){
            st.pop();
        }
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }
            st.push(i);
        }

        int largest=-1;
        for(int i=0;i<n;i++){
            int area= heights[i] *(nse[i]-pse[i]-1);
            largest=Math.max(largest,area);
        }
        return largest;


    }

}