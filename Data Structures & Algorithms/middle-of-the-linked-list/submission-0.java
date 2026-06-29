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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode current = head;

        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        int middleNode = count/2;
        for(int i = 0 ; i < middleNode ; i++){
            current = current.next;
        }
        return current;
    }
}