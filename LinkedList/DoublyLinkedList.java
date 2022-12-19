package LinkedList;



class Dll{
	Node head;
	int size=0;
	Dll(){
		head=null;
	}
	class Node
	{
		Node prev;
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
		Node(int data,Node prev,Node next){
			this.data=data;
			this.prev=prev;
			this.next=next;
		}
	}
	
	public void addFirst(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			return;
		}
		node.next=head;
		head.prev=node;
		head=node;
		head.prev=null;
		System.out.println("addFirst");
	}
	
	public void addLast(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
			return;
			}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		node.next=null;
		node.prev=temp;
		temp.next=node;
		System.out.println("addLast");
		
	} 
	public void display() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		Dll obj=new Dll();
		obj.addFirst(10);
		obj.addFirst(20);
		obj.addFirst(30);
		obj.addLast(100);
		obj.display();

	}

}
