class Node{
    int val;
    int min;
    Node(int val,int min){
        this.val=val;
        this.min=min;
    }
}

class MinStack {  
    Stack<Node> st;
    public MinStack() {
       st= new Stack();
     }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(new Node(val,val));
            return ;
        }
        Node nodeTop=st.peek();
        int minTo=nodeTop.min;
        if(minTo < val){
            st.push(new Node(val,minTo));
        }
        else{
            st.push(new Node(val,val));
        }

        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        st.pop();
        
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek().val;
        
    }
    
    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }
        return st.peek().min;
        
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