/* Structure of a Linked List node
class Node {
	int data;
	Node next;
	Node(int key) {
		data = key;
		next = null;
	}
} */

class Solution {
	public Node mergeSort(Node head) {
		// code here
		if (head == null || head.next == null) {
			return head ;
		}
		Node second = split(head);
		head = mergeSort(head);
		second = mergeSort(second);
		return merge(head, second);
	}
    static Node merge(Node first , Node second){
        if(first == null) return second;
        if(second == null) return first;
        if(first.data < second.data){
            first.next = merge(first.next , second);
            return first ;
        }
        else{
            second.next = merge(first,second.next);
            return second;
        }
    }
    static Node split(Node head){
        Node hare = head.next;
        Node tor = head ;
        while(hare != null && hare.next != null){
            hare = hare.next.next ;
            tor = tor.next ;
        }
        Node temp = tor.next;
        tor.next = null;
        return temp ;
    }
}
