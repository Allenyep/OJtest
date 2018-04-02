package leetcode;

import java.util.HashSet;

/**
 * 83. Remove Duplicates from Sorted List
 * @author Allen
 *
 */
public class Main83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null) return head;
    	ListNode pre=head,cur;
    	cur=pre.next;
    	
    	
    	while(cur!=null){
    		if(pre.val==cur.val){
    			pre.next=cur.next;
    			cur=cur.next;
    		}else{
    			pre=cur;
    			cur=cur.next;
    		}
    		
    	}
    	
        return head;
    }

    public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
}
