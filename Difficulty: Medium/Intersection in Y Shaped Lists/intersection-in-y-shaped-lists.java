/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
} */
// optimized one
if(head1 == null || head2 == null){
		    return null;
		}
		Node temp1 = head1 ;
		Node temp2 = head2 ;
		
		while(temp1 != temp2){
		    temp1 = (temp1 == null) ? head1 : temp1.next ;
		    temp2 = (temp2 == null) ? head2 : temp2.next ;
		}
		return temp1 ;


// code i wrote 
class Solution {
	public Node intersectPoint(Node head1, Node head2) {
		// code here
		Node temp1 = head1 ;
		Node temp2 = head2 ;
		int len1 = 0, len2 = 0;
		while (temp1 != null) { len1++; temp1 = temp1.next; }
		while (temp2 != null) { len2++; temp2 = temp2.next; }
		
		temp1 = head1 ;
		temp2 = head2 ;
		
		int diff = Math.abs(len1 - len2);
		if(len1 > len2){
		    while(diff -- > 0) temp1 = temp1.next ;
		}
		else{
		    while(diff -- > 0) temp2 = temp2.next ;
		}
		while (temp1 != null && temp2 != null && temp1 != temp2) { 
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
		return temp1;
	}
}
