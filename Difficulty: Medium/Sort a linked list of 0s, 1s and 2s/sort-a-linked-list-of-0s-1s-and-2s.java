/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null || head.next == null){
            return head ;
        }
        int[] count = new int[3];
        Node temp = head ;
        while(temp != null){
            count[temp.data]++ ;
            temp = temp.next ;
        }
        temp = head ;
        int i = 0 ;
        while(temp != null){
            while(count[i] == 0){
                i++ ;
            }
            temp.data = i ;
            count[i]-- ;
            temp = temp.next;
        }
        return head ;
    }
}