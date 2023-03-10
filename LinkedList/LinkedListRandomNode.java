package LinkedList;
import java.util.*;


//382. Linked List Random Node
//https://leetcode.com/problems/linked-list-random-node/

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

public class LinkedListRandomNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ArrayList<Integer> list=new  ArrayList<Integer>(); 
    public void Solution(ListNode head) {
        while(head!=null){
        list.add(head.val);
        head=head.next;
        }
    }
    
    public int getRandom() {
        double r=Math.random()*list.size();
        return list.get((int)r);
    }

}
