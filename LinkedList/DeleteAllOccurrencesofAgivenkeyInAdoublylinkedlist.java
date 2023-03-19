package LinkedList;

//Delete all occurrences of a given key in a doubly linked list
public class DeleteAllOccurrencesofAgivenkeyInAdoublylinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
		    this.data = data;
		    next = prev = null;
		}
	
	static Node deleteAllOccurOfX(Node head, int x) {
        if(head==null )return head;
        if(head.next==null){
            if(head.data==x)return null;
            else return head;
        }
        Node t=head;
        while( t.next!=null){
            if(head.data==x){
                head=head.next;
                head.prev=null;
            }
            else if(t.data==x){
                Node before=t.prev;
                Node after=t.next;
                before.next=after;
                after.prev=before;
            }
            t=t.next;
        }
        if(t.data==x){
            Node lastdelete=t.prev;
            lastdelete.next=null;
        }
        return head;
    }

	}}
