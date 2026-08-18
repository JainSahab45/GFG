/* Structure of Linked List Node
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    public void deleteNode(Node x) {
        // code here
        Node nextn = x.next ;
        x.data = nextn.data ;
        x.next = nextn.next ;
        nextn.next = null;
    }
}