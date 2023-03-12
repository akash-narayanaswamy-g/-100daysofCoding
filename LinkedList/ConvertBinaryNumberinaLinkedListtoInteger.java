package LinkedList;


//1290. Convert Binary Number in a Linked List to Integer

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
public class ConvertBinaryNumberinaLinkedListtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getDecimalValue(ListNode head) {
        int v=0,c=0;
        ListNode temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.print(c);

        temp=head;
        while(temp!=null){
            v+=temp.val*Math.pow(2,--c);
            temp=temp.next;
        }
        return v;
    }

}
