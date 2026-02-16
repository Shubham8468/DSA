class Solution {
    public void reverseString(char[] s) {
        Stack<Character> st= new Stack<>();
        for(char i : s){
            st.push(i);
        }
        for(int i=0 ; i<s.length;i++){
            s[i]=st.pop();
        }

       
    }
}