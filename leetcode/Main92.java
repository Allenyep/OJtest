package leetcode;

/**
 * 92. Reverse Linked List II
 * @author Allen
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Main92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(head==null)return null;
    	if(n==m) return head;
    	
    	ListNode du=new ListNode(0);
    	du.next=head;
    	
    	ListNode pre=du;
    	for(int i=0;i<m-1;i++)pre=pre.next;
    	
    	ListNode cur=pre.next;
    	ListNode next=cur.next;
    	
    	for(int i=0;i<n-m;i++){
    		cur.next=next.next;
    		next.next=pre.next;
    		pre.next=next;
    		next=cur.next;
    	}
    	
    	
    	
        return du.next;
    }
     public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
     }
}
