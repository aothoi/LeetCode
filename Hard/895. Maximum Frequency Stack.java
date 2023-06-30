/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

/*Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.

Implement the FreqStack class:

FreqStack() constructs an empty frequency stack.
void push(int val) pushes an integer val onto the top of the stack.
int pop() removes and returns the most frequent element in the stack.
If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.
*/

//Runtime: 38 ms & Memory: 55.7 MB

class FreqStack {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Stack<Integer>> max = new HashMap<>();
        int maxFreq = 0;
    
    public void push(int val) {
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);
        if(f > maxFreq) maxFreq = f;

        if (!max.containsKey(f)) max.put(f, new Stack<Integer>());
        max.get(f).push(val);
    }
    
    public int pop() {
       int popVal = max.get(maxFreq).pop();
       freq.put(popVal, maxFreq - 1);

       if(max.get(maxFreq).size() == 0) maxFreq = maxFreq-1;

       return popVal;
    }
}
