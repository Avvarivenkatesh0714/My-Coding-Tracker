import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class DeleteKthPositionNode {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to delete Kth node
    public static Node deleteKthPositionNode(Node head, int k) {
        if (head == null) return null;

        // If we need to delete the first node
        if (k == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;
        int count = 1;

        // Traverse to the (k-1)th node
        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        // If k is more than the number of nodes
        if (temp == null || temp.next == null)
            return head;

        // Remove the kth node
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        // Create linked list from array
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        System.out.println("Original Linked List:");
        print(head);

        head = deleteKthPositionNode(head, 3);

        System.out.println("After Deleting 3rd Node:");
        print(head);
    }
}
