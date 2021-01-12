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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode r1 = l1, r2=l2, prev = null;
        while(r1!=null && r2!=null){
            r1.val = r1.val+r2.val+carry;
            carry = r1.val/10;
            r1.val = r1.val%10;
            r2.val = r1.val;
            prev = r1;
            r1 = r1.next;
            r2 = r2.next;
            
        }
        ListNode head = null;
        if(r1!=null){
            while(carry!=0 && r1!=null){
                r1.val = r1.val+carry;
                carry = r1.val/10;
                r1.val = r1.val%10;
                prev = r1;
                r1 = r1.next;
            }
            head = l1;
        }
        else if(r2!=null){
            while(carry!=0 && r2!=null){
                r2.val = r2.val+carry;
                carry = r2.val/10;
                r2.val = r2.val%10;
                prev=r2;                
                r2 = r2.next;
            }
            head = l2;
        }
        else{
            head = l1;
        }
        if(prev!=null&&carry!=0){
            prev.next = new ListNode(carry);
        }
        return head;
    }
}
//https://leetcode.com/problems/add-two-numbers/
