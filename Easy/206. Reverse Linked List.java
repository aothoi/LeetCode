/**

* Given the head of a singly linked list, reverse the list, and return the reversed list.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Approach 01: Runtime: 0 ms & Memory: 42.2 MB

public ListNode reverseList(ListNode head) {
 
  ListNode prev = null;

  while(head != null){
    ListNode nextNode = head.next;
    head.next = prev;
    prev = head;
    head = nextNode;
  }
  
  return prev;
}
