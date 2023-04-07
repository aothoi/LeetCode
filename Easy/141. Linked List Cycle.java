/*

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//Approach 01: Memory: 44.2 MB & Runtime: 460 ms

public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }

        ArrayList<ListNode> nextVals = new ArrayList<ListNode>();

        ListNode currNode = head;

        while(currNode.next != null){
            if(nextVals.contains(currNode)){
                return true;
            }

            nextVals.add(currNode);
            currNode = currNode.next;
        }
        return false;
    }
}

//Approach 01: Memory: 43.6 MB & Runtime: 0 ms

public class Solution {
    public boolean hasCycle(ListNode head) {

       if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) {
                return true;
            }
        }
        
        return false;
    }
}
