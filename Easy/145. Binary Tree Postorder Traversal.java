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

//Approach 1
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
		if(root==null) return list;
		list.addAll(postorderTraversal(root.left));
		list.addAll(postorderTraversal(root.right));
        list.add(root.val);
		return list;
    }
}

//Approach 2
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
    
        return addNode(root, list);
    }

    public List<Integer> addNode(TreeNode root, List<Integer> list){
        if(root == null) return list;

        addNode(root.left, list);
        addNode(root.right, list);
        list.add(root.val);

        return list;
    }
