package LinkedList;

//237. Delete Node in a Linked List
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/

class LinkedLis1{
	Node head;
		
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
		public void insertfirst(int data) {
			
			Node node1=new Node(data);
			node1.next=head;
			head=node1;
		
				
		}
		public void deleteNode(Node node) {
	        node.value=node.next.value;
	        node.next=node.next.next;
	        
	    }
}

public class DeleteGivenNode {

	public static void main(String[] args) {
		LinkedLis1 obj=new LinkedLis1();
		obj.insertfirst(45);
		obj.insertfirst(55);
		obj.insertfirst(65);
	
		
	}
		

}
