import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        // Create a Min-Heap based on the data value of the nodes
        PriorityQueue<Node> minHeap = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                return Integer.compare(n1.data, n2.data);
            }
        });

        // Step 1: Push the head of every horizontal list into the Min-Heap
        Node temp = head;
        while (temp != null) {
            minHeap.add(temp);
            temp = temp.next;
        }

        // Dummy node to easily build the new flattened vertical list
        Node dummy = new Node(0);
        Node tail = dummy;

        // Step 2: Pop the smallest element, link it, and push its bottom node
        while (!minHeap.isEmpty()) {
            // Extract the node with the minimum value
            Node curr = minHeap.poll();

            // Link this node to our flattened list using the bottom pointer
            tail.bottom = curr;
            tail = tail.bottom;

            // Step 3: If the extracted node has a bottom node, push it into the heap
            if (curr.bottom != null) {
                minHeap.add(curr.bottom);
            }

            // Clear the next pointer to keep the final list purely vertical
            tail.next = null;
        }

        return dummy.bottom;
    }
}
