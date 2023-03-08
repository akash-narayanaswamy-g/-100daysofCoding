package LinkedList;

//328. Odd Even Linked List
//https://leetcode.com/problems/odd-even-linked-list/
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
public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode oddEvenList(ListNode head) {
	        if(head==null || head.next==null)return head;
	        ListNode odd=head;
	        ListNode even=head.next;
	        ListNode evenhead=even;

	        while(even!=null && even.next!=null){
	            odd.next=even.next;
	            odd=odd.next;
	            even.next=odd.next;
	            even=even.next;    
	        }

	        odd.next=evenhead;
	        return head;

	    }

}
