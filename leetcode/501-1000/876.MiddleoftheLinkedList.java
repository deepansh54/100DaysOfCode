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
        ListNode slow = new ListNode(-1,head);
        ListNode fast = head;
        int n=0;
        
        while(fast!=null){
            slow=slow.next;
            n++;
            fast=fast.next;
            if(fast!=null){
                n++;
                fast=fast.next;
            }
        }
        return n%2!=0?slow:slow.next;
    }
}
//https://leetcode.com/problems/middle-of-the-linked-list/
