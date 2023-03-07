package LinkedList;

import java.util.*;
//234. Palindrome Linked List
//https://leetcode.com/problems/palindrome-linked-list/


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
public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        for(int i=0;i<l.size()/2;i++){
            if(l.get(i)!=l.get(l.size()-i-1))return false;
        }
        return true;
    }

}
