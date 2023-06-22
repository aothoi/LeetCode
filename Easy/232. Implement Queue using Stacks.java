class MyQueue {

    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<Integer>();    
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Iterator<Integer> value = stack.iterator();
        Stack<Integer> stackDummy = new Stack<Integer>();

        int elem = value.next();

        while (value.hasNext()) {
            stackDummy.push(value.next());
        }

        stack = stackDummy;

        return  elem;
    }
    
    public int peek() {
        Iterator<Integer> value = stack.iterator();

        if (value.hasNext()) {
            return  value.next();
        }

        return  -1;
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
