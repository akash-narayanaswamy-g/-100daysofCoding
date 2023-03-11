package LinkedList;

//148. Sort List
//https://leetcode.com/problems/sort-list/
import java.util.*;

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
public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode sortList(ListNode head) {
        ListNode l=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(l!=null){
            list.add(l.val);
            l=l.next;
        }
        Collections.sort(list);
        int i=0;
        l=head;
        while(l!=null){
            l.val=list.get(i++);
            l=l.next;
        }
        return head;
    }

}
