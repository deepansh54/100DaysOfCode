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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode fast = head;
        ListNode lk= null;
        ListNode lnk = null;
        while(fast!=null){
            len++;
            if(k==len){
                lk=fast;
            }
            fast = fast.next;
            if(fast!=null){
                len++;
                if(k==len){
                    lk=fast;
                }
                fast = fast.next;
            }
        }
        //System.out.println("Length = "+len);
        int n=len;len=0;
        fast = head;
        while(fast!=null){
            len++;
            if(n-k+1==len){
                lnk=fast;
            }
            fast = fast.next;
            if(fast!=null){
                len++;
                if(n-k+1==len){
                    lnk=fast;
                }
                fast = fast.next;
            }
            
        }
        int tmp = lk.val;
        lk.val = lnk.val;
        lnk.val = tmp;
        return head;
    }
}
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
