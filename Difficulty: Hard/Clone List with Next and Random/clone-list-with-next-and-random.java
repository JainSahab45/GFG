/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}*/

class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        if(head == null){
            return head ;
        }
        // Step 1: Create clone nodes and insert them next to original nodes
        Node temp = head;
        while(temp != null){
            Node nextn = temp.next;
            Node clonen = new Node(temp.data);
            
            temp.next = clonen ;
            clonen.next = nextn ;
            temp = nextn ;
        }
        // Step 2: Set the random pointers for the cloned nodes
        temp = head ;
        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next ;
            }
            temp = temp.next.next ;
        }
        Node dum = new Node(0);
        Node clonetail = dum ;
        temp = head ;
        while(temp != null){
            Node nexto = temp.next.next ;
            Node clonen = temp.next ;
            clonetail.next = clonen ;
            clonetail = clonen ;
            temp.next = nexto ;
            temp = nexto ;
        }
        return dum.next ;
    }
}