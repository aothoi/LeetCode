/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
Record a new score of x.

'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.

Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

Constraints:
1 <= operations.length <= 1000
operations[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].
For operation "+", there will always be at least two previous scores on the record.
For operations "C" and "D", there will always be at least one previous score on the record.
*/

//Runtime: 3 ms && Memory: 40.8 MB

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();
        int res = 0;

        for(int i=0; i<operations.length; i++){

            if(operations[i].equals("C")){
                res = res - scores.pop();
            } 
            
            else if(operations[i].equals("D")){
                res = res + scores.push(scores.peek()*2);
            } 
            
            else if(operations[i].equals("+")){
                int val1 = scores.pop();
                int val2 = scores.peek();
                scores.push(val1);
                res = res + scores.push(val1 + val2);
            } 
            
            else{
                res = res + scores.push(Integer.valueOf(operations[i]));
            }
        }

        return res;
    }
}
