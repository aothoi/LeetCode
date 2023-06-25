class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new PriorityQueue<Integer>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        Queue<Integer> dummy = new PriorityQueue<Integer>();
        Iterator<Integer> value = queue.iterator();

        for(int i=1; i<queue.size(); i++){
            dummy.add(value.next());
        }

        int pop = value.next();

        queue = dummy;

        return  pop;
    }
    
    public int top() {
        int top = -1;
        Iterator<Integer> value = queue.iterator();

        while (value.hasNext()) {
            top =  value.next();
        }

        return  top;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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
