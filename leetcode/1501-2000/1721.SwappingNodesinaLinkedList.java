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
        ListNode tmp = head;
        int n = 0;
        ListNode kStart = null;
        while(tmp!=null){
            n++;
            if(n == k){
                kStart = tmp;
            }
            tmp = tmp.next;
        }
        int i = n-k;
        tmp=head;
        while(i>0){
            tmp = tmp.next;
            i--;
        }
        i = tmp.val;
        tmp.val = kStart.val;
        kStart.val = i;
        return head;
    }
}
//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
