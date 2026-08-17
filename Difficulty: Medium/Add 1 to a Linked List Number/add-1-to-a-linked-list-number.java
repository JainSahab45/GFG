/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        Node temp = head ;
        
        Node curr = temp ;
        Node prev = null ;
        while(curr != null){
            Node newn = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = newn ;
        }
        int sum = 0 ;
        int carr = 1 ;
        
        Node resultHead = null;
        Node resultTail = null ;
        
        while(prev != null || carr > 0){
            int currentSum = carr;
            if (prev != null) {
                currentSum += prev.data; 
                prev = prev.next;        
            }
            
            sum = currentSum % 10;
            carr = currentSum / 10;
            Node newNode = new Node(sum);
            if(resultHead == null){
                resultHead = newNode ;
                resultTail = newNode;
            }
            else{
                resultTail.next = newNode;
                resultTail = newNode;
            }
        }
        Node prevResult = null;
        Node currResult = resultHead;
        while(currResult != null){
            Node nextn = currResult.next;
            currResult.next = prevResult;
            prevResult = currResult;
            currResult = nextn;
        }
        // while(prevResult != null && prevResult.data == 0 && prevResult.next != null){
        //     prevResult = prevResult.next ;
        // }
        return prevResult ;
    }
}