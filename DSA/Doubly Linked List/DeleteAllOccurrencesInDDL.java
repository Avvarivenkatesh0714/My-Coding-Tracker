import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

public class DeleteAllOccurrencesInDDL {

    public static Node arrayInToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Delete all occurrences of a key in DLL
    public static Node deleteAllOccurrences(Node head, int key) {
        if (head == null) return null;

        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {

                // Case 1: delete head
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                // Case 2: delete middle or tail node
                else {
                    temp.prev.next = temp.next;
                    if (temp.next != null) {
                        temp.next.prev = temp.prev;
                    }
                }
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 2, 5};
        Node head = arrayInToLL(arr);

        head = deleteAllOccurrences(head, 2);

        printLL(head); // Output: 1 3 4 5
    }
}
