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
    public boolean isPalindrome(ListNode head) {
        ArrayDeque<Integer> a = new ArrayDeque<>();
        
        while(head!=null){
            a.offerLast(head.val);
            head =head.next;
        }
        while(!a.isEmpty() && a.size()!=1){
            if(!a.pollFirst().equals(a.pollLast())){
                return false;
            }
        }
        
        return true;
    }
}
//https://leetcode.com/problems/palindrome-linked-list/
