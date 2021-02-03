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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head!=null){
            ListNode fast = head.next;
            ListNode slow = head;
            while(fast!=null && slow!=null){
                if(fast == slow){
                    return true;
                }
                else{
                    slow = slow.next;
                    fast = fast.next;
                    if(fast!=null){
                        fast = fast.next;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/linked-list-cycle/
