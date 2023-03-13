package LinkedList;


//2. Add Two Numbers


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
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode i=l1;
    
    ListNode j=l2;

    int carry=0;

    ListNode anshead=null;
    ListNode anstail=null;


    while(i!=null&&j!=null){
    
    carry=carry+i.val+j.val;

    ListNode temp=new ListNode(carry%10);

    carry=carry/10;

    if(anshead==null){
    
    anshead=temp;
    
    anstail=anshead;
    
    }
    
    else{
        anstail.next=temp;
        anstail=temp;
    
    }
    i=i.next;

    j=j.next;
    
    }

    while(i!=null){
    carry=carry+i.val;
    
    ListNode temp=new ListNode(carry%10);
    
    anstail.next=temp;

    anstail=temp;

    carry=carry/10;
    
    i=i.next;
    
    }

    while(j!=null){
    carry=carry+j.val;

    ListNode temp=new ListNode(carry%10);

    anstail.next=temp;

    anstail=temp;

    carry=carry/10;

    j=j.next;
    }

    while(carry!=0){
    
    ListNode temp=new ListNode(carry%10);
    
    anstail.next=temp;
    
    anstail=temp;
    
    carry=carry/10;
    
    }
    return anshead;
    }

}
