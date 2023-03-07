package LinkedList;

import java.util.*;

//141. Linked List Cycle
//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasCycle(ListNode head) {
        HashSet <ListNode> hashTable=new HashSet<>();
    while(head != null) {
        if(hashTable.contains(head)) return true;
        hashTable.add(head);
        head = head.next;
    }
    return false;
    }

}
