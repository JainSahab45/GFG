/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data > head2.data) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        }
        Node temp1 = head1;
        Node temp2 = head2;
        Node prev = null ;
        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                prev = temp1;
                temp1 = temp1.next ;
            }
            else{
                Node next2 = temp2.next ;
                prev.next = temp2;  
                temp2.next = temp1 ;
                
                prev = temp2;
                temp2 = next2 ;
            }
        }
        if (temp2 != null) {
            prev.next = temp2;
        }
        return head1;
    }
}