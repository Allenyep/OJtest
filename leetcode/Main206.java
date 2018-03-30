package leetcode;

/**
 * 206. Reverse Linked List
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
public class Main206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
    public ListNode reverseList(ListNode head) {
    	ListNode pre=null;
    	ListNode cur=head;
    	
    	while(cur!=null){
    		ListNode next=cur.next;
    		
    		cur.next=pre;
    		pre=cur;
    		cur=next;
    	}
    	
    	return pre;
    }
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; 
		  }
	  }

}
