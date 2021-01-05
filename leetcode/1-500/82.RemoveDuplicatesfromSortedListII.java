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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        boolean duplicate = false;
        while(curr!=null){
            while(curr.next != null && curr.next.val == curr.val){
                curr = curr.next;
                duplicate = true;
            }
            if(!duplicate){
                prev = curr;
            }
            else if(prev == null){
                head = curr.next;
            }
            else{
                prev.next = curr.next;
            }
            curr = curr.next;
            duplicate = false;
        }
        return head;
    }
}
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/