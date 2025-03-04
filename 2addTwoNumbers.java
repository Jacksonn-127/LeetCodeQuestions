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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // dummy node
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        dummy.next = temp;

        // total and carry for any given substep 
        int total = 0;
        int carry = 0;

        // continue while either l1 or l2 is not null
        // continue until carry is 0 also
        while(l1 != null || l2 != null || carry != 0){
            total = carry;

            if(l1 != null){
                total += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                total += l2.val;
                l2 = l2.next;
            }
            // done because number can be greater than 10 for any given step 
            int num = total % 10;
            // increase carry
            carry = total / 10;

            // put new value into node 
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return temp.next;
    }
}
