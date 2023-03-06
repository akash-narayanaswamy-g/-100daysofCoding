package LinkedList;

//Count nodes of linked list
//https://practice.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list

/*class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

public class Countnodesoflinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int getCount(Node head)
    {
        
        int s=1;
        Node temp=head;
        while(temp.next!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }

}
