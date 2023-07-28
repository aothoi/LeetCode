/**
You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
Return the head of the modified linked list.

Example 1:
Input: head = [0,3,1,0,4,5,2,0]
Output: [4,11]


Example 2:
Input: head = [0,1,0,3,0,2,2,0]
Output: [1,3,4]

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode list =  new ListNode(), root = new ListNode();
        root = list;
        head = head.next;
        int sum = 0;
        while(head != null){
            if(head.val == 0){
                list.next = new ListNode(sum);
                list = list.next;
                sum = 0;
            }
            sum += head.val;
            head = head.next;
        }

        return root.next;
    }
}
