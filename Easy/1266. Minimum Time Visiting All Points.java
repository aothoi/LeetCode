/*
Input: points = [[1,1],[3,4],[-1,0]]
Output: 7
Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]   
Time from [1,1] to [3,4] = 3 seconds 
Time from [3,4] to [-1,0] = 4 seconds
Total time = 7 seconds

Example 2:
Input: points = [[3,2],[-2,2]]
Output: 5
*/

// Runtime: 0ms & Memory: 43 MB

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        
        for(int i=0; i<points.length-1; i++){
            int x = points[i][0] - points[i+1][0];
            x = x<0 ? -x : x;
            int y = points[i][1] - points[i+1][1];
            y = y<0 ? -y : y;
            time += Math.max(x, y);
        }

        return time;
    }
}
