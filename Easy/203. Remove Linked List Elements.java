/*
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
*/


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;

        ListNode node = head;

        while(node != null && node.next != null){
            if(node.next.val == val) node.next = node.next.next;
            else node = node.next;
        }

        return head;
    }
}


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
