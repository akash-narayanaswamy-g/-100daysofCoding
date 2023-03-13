package LinkedList;


class circLL{
	Node head;
	Node tail;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
		Node(int value,Node next){
			this.value=value;
			this.next=next;
		}
	}
	
	public void insertfirst(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
			return;
		}
		tail.next=n;
		n.next=head;
		head=n;
	}
	
	public void insertLast(int data) {
		if(head==null) {
			insertfirst(data);
			return;
		}
		Node n=new Node(data);
		tail.next=n;
		n.next=head;
		tail=n;
		
	}
	
	public void insert(int val,int index) {
		head=insert(val, index, head);
	}
	
	private Node insert(int val,int index,Node node) {
		if(index==0) {
			Node temp=new Node(val, node);
			return temp;
		}
		node.next=insert(val, index--, node);
		return node;
	}
	
	//deleting
	public void delete(int val) {
		Node node=head;
		if(node==null)return;
		
		if(node.value==val) {
			head=head.next;
			tail.next=head;
			return;
		}
		
		do {
			Node n=node.next;
			if(n.value==val) {
				node.next=n.next;
				break;
			}
			node=node.next;
		}while(node!=head);
	}

	
	public void display() {
		if(head==null) {
			System.out.println("No element to display");
		}
		Node t1=head;
		while(t1.next!=head) {
			System.out.print(t1.value+" -> ");
			t1=t1.next;
		}
		System.out.print(t1.value+" -> HEAD");
		System.out.println();
	} 
}
public class CircularLinkedList {

	public static void main(String[] args) {
		circLL obj=new circLL();
		obj.insertfirst(6);
		obj.insertfirst(5);
		obj.insertfirst(4);
		obj.insertLast(90);
		obj.insertfirst(3);
		obj.insertfirst(2);
		obj.insertfirst(1);
		obj.insertLast(0);
		obj.display();
		obj.delete(4);
		obj.insert(100, 0);
		obj.display();

	}

}
