package LinkedList;

//237. Delete Node in a Linked List
//https://leetcode.com/problems/delete-node-in-a-linked-list/
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
public class DeleteNodeinaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        
    }

}
