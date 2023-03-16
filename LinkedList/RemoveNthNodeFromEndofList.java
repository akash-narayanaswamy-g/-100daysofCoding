package LinkedList;

//19. Remove Nth Node From End of List

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
public class RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode fast = head, slow = head;
	        for (int i = 0; i < n; i++) fast = fast.next;
	        if (fast == null) return head.next;
	        while (fast.next != null) {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        slow.next = slow.next.next;
	        return head;
	    }

}
