/*
class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
}
*/

class Solution {
	public Node rotate(Node head, int k) {
		// code here
// 		Node temp = head ;
// 		Node prev = head ;
		
// 		while (k > 0) {
// 			if (temp.next == null) {
// 				temp.next = head ;
// 				head = prev.next ;
// 				prev.next = null ;
				
// 				temp = head ;
// 				prev = head ;
// 				k--;
// 				continue;
// 			}
// 			prev = temp ;
// 			temp = temp.next ;
// 		}
// 		return prev ;

        if (head == null || head.next == null || k == 0) {
            return head;
        }
        Node tail = head ;
        int length = 1 ;
        while(tail.next != null){
            tail = tail.next ;
            length ++;
        }
        k = k % length ;
        if(k==0){
            return head ;
        }
        tail.next = head ;
        int steps = k ;
        Node newtail = head ;
        for(int i =1 ; i < steps ; i++){
            newtail = newtail.next ;
        }
        Node newHead = newtail.next ;
        newtail.next = null ;
        return newHead;
	}
}
