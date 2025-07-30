class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
      q.add(x);
        
    }
    
    public int pop() {
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
        int item=q.peek();
        q.remove();
        return item;
        
    }
    
    public int top() {
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
        int item=q.remove();
        q.add(item);
        return item;
    }
    
    public boolean empty() {
        if(q.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */