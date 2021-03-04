/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> m = new HashMap<>();
        while(headA != null){
            m.put(headA, true);
            headA = headA.next;
        }
        while(headB != null){
            if(m.get(headB) != null){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
//https://leetcode.com/problems/intersection-of-two-linked-lists/
