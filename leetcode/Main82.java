package leetcode;

/**
 * 82. Remove Duplicates from Sorted List II
 * @author Allen
 *
 */
public class Main82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode pre=head,cur=pre.next,then=null;
        
        while(cur!=null){
        	if(pre.val==cur.val){
        		cur=cur.next;
        	}else{
        		
        		
        	}
        }
    	return null;
    }

    public class ListNode {
    	     int val;
    	     ListNode next;
    	     ListNode(int x) { val = x; }
    	 }
}
