/**
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode dummy = head;

        while(true){
            stack.push(dummy.val);
            if(dummy.next == null) break;
            dummy = dummy.next;
        };

        int size = stack.size();

        for(int i=0; i<size/2; i++){
            if(head.val != stack.pop()) return false;
            head = head.next;
        }
        
        return true;
    }
}
