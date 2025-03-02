/*
Example 1:
----------
Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.

Example 2:
----------
Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
Explanation: There are no common ids, so we just include each id with its value in the resulting list.
*/

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> res = new ArrayList<>();
        int i=0, j=0, n1=nums1.length , n2=nums2.length ;
        
        while(i < n1 && j < n2) {
            if (nums1[i][0] == nums2[j][0]) {
                res.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;

            } else if (nums1[i][0] < nums2[j][0]) {
                res.add(nums1[i++]);
            } else if (nums1[i][0] > nums2[j][0]) {
                res.add(nums2[j++]);
            }
        }

        while (i <n1) {
            res.add(nums1[i++]);
        } 
        
        while(j < n2) {
            res.add(nums2[j++]);
        }

        return res.toArray(new int[res.size()][]);
    }
}
