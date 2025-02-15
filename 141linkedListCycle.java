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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashy = new HashSet<>();

        if(head == null){
            return false;
        }

        hashy.add(head);
        head = head.next;
        
        while(head != null){
            if(hashy.contains(head)){
                return true;
            }
            hashy.add(head);

            head = head.next;
        }

        return false;
    }
}
