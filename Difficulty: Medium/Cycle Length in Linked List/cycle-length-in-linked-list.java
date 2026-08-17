/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if (head == null || head.next == null ) {
            return 0;
        }
        Node tor = head ;
        Node hare = head ;
        // Node prev = head.next ;
        while(hare != null && hare.next != null){
            tor = tor.next ;
            hare = hare.next.next ;
            if(tor == hare){
                Node temp = tor;
                int len = 1 ;
                while(temp.next != tor){
                    len++ ;
                    temp = temp.next;
                }
                return len ;
            }
        }
        return 0;
    }
}