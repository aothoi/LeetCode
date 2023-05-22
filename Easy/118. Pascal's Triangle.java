/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
*/

//Runtime: 1 ms & Memory: 41.3 MB

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> prevRow = null;
        List<Integer> curRow = null;

        for(int i=0; i<numRows; i++){
            curRow = new ArrayList<Integer>();
            curRow.add(1);
            for(int j=1; j<=i; j++){
                if(j == i){
                    curRow.add(1);
                } else{
                    curRow.add(prevRow.get(j-1) + prevRow.get(j));
                }
            }
            res.add(curRow);
            prevRow = curRow;
        }

        return res;
    }
}
