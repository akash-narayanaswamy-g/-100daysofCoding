package LinkedList;

//Delete node in Doubly Linked List
//https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list
public class DeleteNodeinDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}
	
	  Node deleteNode(Node head,int pos)
	    {
		if(pos==1){
		    head=head.next;
		    head.prev=null;
		    return head;
		}
		
		Node cur=head;
		Node pre=null;
		while(cur!=null && pos>1){
		    pre=cur;
		    cur=cur.next;
		    pos--;
		}
		if(cur.next!=null)
		    cur.next.prev=pre;
		pre.next=cur.next;
		 
		 return head;
	    }

}
