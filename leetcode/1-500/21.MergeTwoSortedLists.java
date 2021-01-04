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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode head = l1.val <= l2.val ? l1:l2;
        ListNode curr = null;
        ListNode prev = null;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                prev = l1;
                l1 = l1.next;
            }
            else{
                curr = l2;
                if(prev!=null){
                    prev.next = curr;
                }
                while(curr!=null && l1.val>curr.val){
                    prev = curr;
                    curr = curr.next;
                }
                l2 = curr;
                prev.next = l1;
            }
        }
        if(l2!=null){
            prev.next=l2;
        }
        
        return head;
    }
}
//https://leetcode.com/problems/merge-two-sorted-lists/