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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nth = new ListNode(-1,head);
        ListNode prev = null;
        ListNode curr = head;
        int c=1;
        while(curr!=null){
            if(c==n){
                prev = nth;
                nth = nth.next;
            }
            else{
                c++;
            }
            curr=curr.next;
        }
        if(prev.val!=-1){
            prev.next=nth.next;
        }
        else{
            return nth.next;
        }
        return head;
    }
}
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
