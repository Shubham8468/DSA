class MyCircularQueue {
    int[] arr;
    int count;
    int maxSize;
    int head;
    public MyCircularQueue(int k) {
        arr= new int[k];  
        count=0;
        maxSize=k;
    }
    
    public boolean enQueue(int value) {
        if(count==maxSize){
            return false;
        }
        arr[(head+count)%maxSize]=value;
        count+=1;
        return true; 
    }
    
    public boolean deQueue() {
        if(count==0){
            return false;
        }
        head=(head+1)%maxSize;
        count-=1;;
        return true;
        
    }
    
    public int Front() {
        if(count==0){
            return -1;
        }
        return arr[head];
        
    }
    
    public int Rear() {
        if(count==0){
            return -1;
        }
        return arr[(head+count-1)% maxSize];
        
    }
    
    public boolean isEmpty() {
        if(count==0){
            return true;
        }
        return false;  
    }
    
    public boolean isFull() {
        if(count==maxSize){
            return true;
        }
        return false; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */