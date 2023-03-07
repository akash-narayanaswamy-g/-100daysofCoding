package LinkedList;

//142. Linked List Cycle II
//https://leetcode.com/problems/linked-list-cycle-ii/description/
class akash{
static Node insertNode(Node head,int val) {
    Node newNode = new Node(val);
    if(head == null) {
        head = newNode;
        return head;
    }
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    
    temp.next = newNode;
    return head;
}

static void createCycle(Node head,int pos) {
    Node ptr = head;
    Node temp = head;
    int cnt = 0;
    while(temp.next != null) {
        if(cnt != pos) {
            ++cnt;
            ptr = ptr.next;
        } 
        temp = temp.next;
    }
    temp.next = ptr;
}


static Node detectCycle(Node head) {
    if(head == null||head.next == null) return null;
        
    Node fast = head;
    Node slow = head;
    Node entry = head;
        
    while(fast.next != null&&fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
            
        if(slow == fast) {
            while(slow != entry) {
                slow = slow.next;
                entry = entry.next;
            }
            return slow;
        }
    }
    return null;
//    
//    HashSet<Node> st=new HashSet<>();
//    while(head != null) {
//        if(st.contains(head)) return head;
//        st.add(head);
//        head = head.next;
//    }
//    return null;
}

public class LinkedListCycleII {
	
	public static void main(String args[]) {
	    Node head = null;
	    
	    head=insertNode(head,1);
	    head=insertNode(head,2);
	    head=insertNode(head,3);
	    head=insertNode(head,4);
	    head=insertNode(head,3);
	    head=insertNode(head,6);
	    head=insertNode(head,10);
	    
	    createCycle(head,2);
	    
	    Node nodeRecieve = detectCycle(head);
	    if(nodeRecieve == null) System.out.println("No cycle");
	    else {
	        Node temp = head;
	        int pos = 0;
	        while(temp!=nodeRecieve) {
	            ++pos;
	            temp = temp.next;
	        }
	        System.out.println("Tail connects at pos "+pos);
	    }
	    
	}
}
}
