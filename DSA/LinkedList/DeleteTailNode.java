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

public class DeleteTailNode {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to delete the tail node
    public static Node deleteTailNode(Node head) {
        // If list is empty or has only one node
        if (head == null || head.next == null) return null;

        Node temp = head;

        // Traverse till second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove the tail node
        temp.next = null;
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

        head = deleteTailNode(head); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}
