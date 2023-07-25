/*
Example 1:
Input: operations = ["--X","X++","X++"]
Output: 1

Example 2:
Input: operations = ["++X","++X","X++"]
Output: 3
*/

//Runtime: 0 ms & Memory: 42 MB

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for(int i=0; i<operations.length; i++){
            if(operations[i].charAt(1) == '+') ans++;
            else ans--;
        }

        return ans;
    }
}
