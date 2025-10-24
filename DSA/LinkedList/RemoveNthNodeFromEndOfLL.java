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

public class RemoveNthNodeFromEndOfLL {

    public static Node removeNthNodeFromEndOfLL(Node head, int n) {
        if (head == null) return null;

        // Step 1: Count total nodes
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Step 2: Calculate node to delete (cnt - n + 1)th node
        int ans = cnt - n + 1;

        // If we need to remove the head
        if (ans == 1) {
            return head.next;
        }

        // Step 3: Traverse to the node just before the target
        temp = head;
        int timer = 1;
        while (temp != null && temp.next != null) {
            if (timer == ans - 1) {
                temp.next = temp.next.next;
                break;
            }
            timer++;
            temp = temp.next;
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node res = removeNthNodeFromEndOfLL(head, 3);  // deletes 2nd node from end
        printList(res);  // Expected output: 1 2 3 5
    }
}
