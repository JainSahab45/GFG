class Solution {
    public Node swapKth(Node head, int k) {
        // Base case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Count the total number of nodes (n)
        int n = 0;
        Node current = head;
        while (current != null) {
            n++;
            current = current.next;
        }

        // If k is out of bounds, return the original list
        if (k > n) {
            return head;
        }

        // If the kth node from beginning and end is the same node, no swap needed
        if (2 * k - 1 == n) {
            return head;
        }

        // 2. Find the kth node from the beginning
        Node first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // 3. Find the kth node from the end (which is (n - k + 1)th node from beginning)
        Node second = head;
        for (int i = 1; i < n - k + 1; i++) {
            second = second.next;
        }

        // 4. Swap the data values of the two nodes
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return head;
    }
}
