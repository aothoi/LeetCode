//Given the root of a binary tree, return the inorder traversal of its nodes' values.

//Runtime: 0 ms & Memory:  40.9 MB

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        return list;
    }

    public List<Integer> addNode(TreeNode root, List<Integer> list){
        if(root == null) return null;

        addNode(root.left, list);
        list.add(root.val);
        addNode(root.right, list);

        return list;
    }
}
