/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newn = new Node(data);
        // Node temp = head ;
        //insert at begin
        if(data <= head.data){
        Node temp = head ;
        while(temp.next != head ){
            temp = temp.next;
        }   
        newn.next = temp.next ; 
        temp.next = newn ;
        return newn ;   
        }
        // insert somewhere
        Node temp = head ;
        while(temp.next != head && temp.next.data < data ){
            temp = temp.next;
        }   
        newn.next = temp.next ; 
        temp.next = newn ;
        return head ;
    }
}