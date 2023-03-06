package LinkedList;

//Search in Linked List
//https://practice.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326

/*class Node {
	   int data;
	    Node next;
	    Node(int d)  { data = d;  next = null; }
	}*/
public class SearchinLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static boolean searchKey(int n, Node head, int key) {
        Node temp=head;
        while(n!=0){
            if(temp.data==key)
                return true;
            temp=temp.next;
            n--;
        }
        return false;
    }

}
