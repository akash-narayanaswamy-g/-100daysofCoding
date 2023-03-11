package LinkedList;
import java.util.*;

//160. Intersection of Two Linked Lists
//https://leetcode.com/problems/intersection-of-two-linked-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionofTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> s=new HashSet<>();
        while(headA!=null){
            s.add(headA);
            headA=headA.next;
        }

        while(headB!=null){
            if(s.contains(headB))return headB;
            headB=headB.next;
        }
        
        return null;
    }

}
