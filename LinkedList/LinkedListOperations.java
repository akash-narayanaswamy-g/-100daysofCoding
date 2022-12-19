package LinkedList;

class LinkedList{
	Node head;
	Node tail;
	int size=0;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			size++;
			this.value=value;
		}
		Node(int value,Node next){
			size++;
			this.value=value;
			this.next=next;
		}}
		
		public void insertfirst(int data) {
						
			Node node1=new Node(data);
			node1.next=head;
			head=node1;
			
			if(tail==null)
				tail=head;	
		}
		
		public void insertLast(int data) {
			if(tail==null) {
				insertfirst(data);
				return;
			}
			
			Node node1=new Node(data);
			tail.next=node1;
			tail=node1;
		}
		public void insert(int value,int pos) {
			if(head==null) {
				insertfirst(value);
				return;
			}
			if(size==pos) {
				insertLast(value);
				return;
			}
			Node temp=head;
			for(int i=1;i<pos;i++) {
				temp=temp.next;
			}
			Node obj=new Node(value, temp.next);
			temp.next=obj;
			
		}
		
		public Node get(int index) {
			Node temp=head;
			for (int i = 0; i < index; i++) {
				temp=temp.next;
			}
			return temp;
		}
		
		//deleting
		public void deleteFirst() {
			head=head.next;
			if(head==null)
				tail=null;
				return;
		}
		
		public void deleteLast() {
			Node temp=head;
			while(temp.next!=tail) {
			temp=temp.next;
			}
			temp.next=null;
			size--;
		}
		
		public void delete(int index) {
			if(index==0) {
				deleteFirst();}
			if(index==size-1) {
				deleteLast();
				return;
			}
			Node temp=get(index-1);
			temp.next=temp.next.next;
		}
		
		public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.value+"->");
				temp=temp.next;
			}
		}
	
}

public class LinkedListOperations {

	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		obj.insertfirst(45);
		obj.insertfirst(55);
		obj.insertfirst(65);
		obj.insertfirst(75);
		obj.insertLast(188);
		obj.insert(5602, 2);
		obj.display();
		System.out.println();
		obj.deleteFirst();
		obj.display();
		System.out.println();
		obj.deleteLast();
		obj.display();
		obj.delete(1);
		System.out.println();
		obj.display();

	}

}
