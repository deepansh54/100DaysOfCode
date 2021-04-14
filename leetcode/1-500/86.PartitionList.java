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
    public ListNode partition(ListNode head, int x) {
       
        ListNode smallHead = null;
        ListNode smallCurr = null;
        
        ListNode largeHead = null;
        ListNode largeCurr = null;
        
        ListNode curr = head;
        
        while(curr!=null){
            if(curr.val<x){
                if(smallHead == null){
                    smallHead = curr;
                    smallCurr = smallHead;
                }
                else{
                    smallCurr.next = curr;
                    smallCurr = curr;
                }
            }
            else{
                if(largeHead == null){
                    largeHead = curr;
                    largeCurr = largeHead;
                }
                else{
                    largeCurr.next = curr;
                    largeCurr = curr;
                }
            }
            curr = curr.next;
        }
        if(smallHead!=null){
            head = smallHead;
            if(largeHead!=null){
                smallCurr.next = largeHead;
                largeCurr.next = null;
            }
            else{
                smallCurr.next =null;
            }
        }
        else if (largeHead!=null){
            head = largeHead;
            largeCurr.next =null;
        }
        return head;
    }
}
//https://leetcode.com/problems/partition-list/
