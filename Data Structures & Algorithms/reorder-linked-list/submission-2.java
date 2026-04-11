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
    public void reorderList(ListNode head) {

        ListNode f = head.next;
        ListNode s = head;
        
        
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }

        ListNode sec = s.next;
        ListNode prev = s.next = null;

        while(sec != null){
            ListNode temp = sec.next;
            sec.next = prev;
            prev = sec;
            sec = temp;
        }

        ListNode first = head;
        sec = prev;

        while(sec != null){
            ListNode temp1 = first.next;
            ListNode temp2 = sec.next;
            first.next = sec;
            sec.next = temp1;
            first = temp1;
            sec = temp2;

        }

    }
}
