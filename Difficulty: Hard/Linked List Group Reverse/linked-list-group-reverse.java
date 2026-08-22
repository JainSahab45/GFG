/* Structure of linked list Node
class Node
{
	int data;
	Node next;
	Node(int key)
	{
		data = key;
		next = null;
	}
} */

class Solution {
	public Node reverseKGroup(Node head, int k) {
		// code here
		if (head == null || k <= 1) {
			return head ;
		}
// 		int len = 0 ;
// 		Node curr = head ;
// 		while (curr != null) {
// 			len++ ;
// 			curr = curr.next ;
// 		}
		Node dum = new Node(0);
		dum.next = head ;
		Node prevgrptail = dum;
		Node temp = head ;
		while (temp != null) {
			Node grphead = temp ;
			Node prev = null ;
			Node nextn = null ;
			int count = 0 ;
			while(temp != null && count < k) {
				nextn = temp.next ;
				temp.next = prev ;
				prev = temp ;
				temp = nextn ;
				count++ ;
			}
			prevgrptail.next = prev ;
			prevgrptail = grphead ;
		}
		if(temp != null){
		    prevgrptail.next = temp ;
		}
		return dum.next ;
	}
}

// Node temp = head ;
//         Node prev = null ;
//         Node nextn = null ;
//         while(temp != null){
//             while(k != 0){
//                 nextn = temp.next ;
//                 Node newn = temp.next ;
//                 temp.next = prev ;
//                 prev = temp ;
//                 temp = newn ;
//                 k-- ;
//             }
//             temp = nextn ;
//         }
//         return prev ;
