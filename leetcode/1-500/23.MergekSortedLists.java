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
    public ListNode mergeKLists(ListNode[] lists) {
        int[] a1 = new int[10001];
        int[] a2 = new int[10001];
        for(ListNode ln : lists){
            while(ln!=null){
                if(ln.val>=0){
                    a1[ln.val]++;
                }
                else{
                    a2[ln.val*-1]++;
                }
                ln = ln.next;
            }
        }
        ListNode start = null;
        for(int i=10000;i>0;i--){
            if(a2[i]>0){
                start = new ListNode(-1*i);
                a2[i]-=1;
                break;
            }
        }
        if(start!=null){
            ListNode prev = start;
            for(int i=-1*start.val;i>0;i--){
                while(a2[i]>0){
                    ListNode curr = new ListNode(-1*i);
                    a2[i]-=1;
                    prev.next = curr;
                    prev = curr;
                }
            }
            for(int i=0;i<10001;i++){
                while(a1[i]>0){
                    ListNode curr = new ListNode(i);
                    a1[i]-=1;
                    prev.next = curr;
                    prev = curr;
                }
            } 
        }
        else{
            for(int i=0;i<10001;i++){
                if(a1[i]>0){
                    start = new ListNode(i);
                    a1[i]-=1;
                    break;
                }
            }
            ListNode prev = start;
            if(start!=null){
                for(int i=0;i<10001;i++){
                    while(a1[i]>0){
                        ListNode curr = new ListNode(i);
                        a1[i]-=1;
                        prev.next = curr;
                        prev = curr;
                    }
                } 
            }
            else{
                return start;
            }
            
        }
        return start;
    }
}
//https://leetcode.com/problems/merge-k-sorted-lists/
