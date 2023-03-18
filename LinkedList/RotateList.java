package LinkedList;

//61. Rotate List

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
public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null || head.next==null)return head;
	        ListNode t=head;
	        int c=0;
	        while(t!=null){
	            t=t.next;
	            c++;
	        }
	        k%=c;
	        for(int i=0;i<k;i++){
	        t=head;
	        ListNode t2=t.next;
	        while(t2!=null & t2.next!=null){
	            t=t.next;
	            t2=t2.next;
	        }
	        t2.next=head;
	        head=t2;
	        t.next=null;
	        
	        }
	        return head;
	    }

}
