/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        if (head == null || head.next == null) {
            return -1;
        }
        Node hare = head ;
        Node tor = head ;
        boolean cycle = false ;
        
        while(hare != null && hare.next != null){
            hare = hare.next.next ;
            tor = tor.next ;
            if(tor == hare){
                cycle = true ;
                break ;
            }
        }
        if(!cycle){
            return -1 ;
        }
        tor = head ;
        while(tor != hare){
            tor = tor.next ;
            hare = hare.next ;
        }
        return tor.data ;
        
    }
}

// Node hare = head.next ;
//         Node tor = head ;
//         if(hare == null || hare.next == null){
//             return -1 ;
//         }
//         while(hare != tor){
//             if(hare.next == null){
//                 return -1 ;
//             }
//             hare = hare.next.next ;
//             tor = tor.next ;
//         }
//         return tor.data ;