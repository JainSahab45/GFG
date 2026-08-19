/* Structure of a Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	Node divide(Node head) {
		// code here
		
		if (head == null || head.next == null) {
			return head ;
		}
		
		// dummy node 0 -> 2 etc..
		Node evenhead = new Node(0);
		Node oddhead = new Node(0);
		Node eventail = evenhead;
		Node oddtail = oddhead;
		Node temp = head ;
		while (temp != null) {
			if (temp.data % 2 == 0) {
				eventail.next = temp;
				eventail = eventail.next ;
			}
			else {
				oddtail.next = temp ;
				oddtail = oddtail.next;
			}
			temp = temp.next ;
		}
		oddtail.next = null;
		eventail.next = oddhead.next ;
		return evenhead.next ;
	}
}
