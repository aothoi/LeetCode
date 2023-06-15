/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

//Runtime: 0 ms & Memory: 41.4 MB

class Solution {
    public void rotate(int[][] matrix) {
        int temp, top= 0;
        int bottom = matrix.length-1;
        
        while(top<bottom){
            for(int i=0; i<bottom-top; i++){
                temp = matrix[top][top+i];
                matrix[top][top+i] = matrix[bottom-i][top];
                matrix[bottom-i][top] = matrix[bottom][bottom-i];
                matrix[bottom][bottom-i] =  matrix[top+i][bottom];
                matrix[top+i][bottom] = temp;
            }
            top++;
            bottom--;
        }
    }
}
