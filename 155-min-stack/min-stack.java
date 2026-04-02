class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
        st= new Stack<>();
        min=new Stack<>();   
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(val);
            min.push(val);
            return;
        }
        else{
            st.push(val);
            if(st.peek() <=min.peek()){
                min.push(val);
                return ;
            }
            return ;
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return ;
        }
        else{
           int val= st.pop();
            if(val==min.peek()){
                min.pop();
                return ;
            }
            return ;
        }
        
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
        
    }
    
    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }
        return min.peek();

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */