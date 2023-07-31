/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
*/

//Runtime: 0 ms & Memory: 40.4 MB

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length-1]){
                for(int j=0; j<matrix[0].length; j++){
                    if(matrix[i][j] == target) return true;
                }
            }
        }
        return false;
    }
}
