/*
Given the root of a binary tree, return the sum of values of its deepest leaves.

Example 1:
----------
Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15

Example 2:
----------
Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 19
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLevel = 0, sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        traverse(root, 0);
            
        return sum;
    }

    public void traverse(TreeNode root, int level) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (level > maxLevel) {
                maxLevel = level;
                sum = 0;
            }
                
            if (level == maxLevel) {
                sum += root.val;
            }
        }

        traverse(root.left, level+1);
        traverse(root.right, level+1);
    }
}
