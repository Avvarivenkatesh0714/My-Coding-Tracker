import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class FindPairsWithGivenSumInDLL {

    // Convert array into Doubly Linked List
    public static Node arrayInToDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            prev.next = newNode;
            newNode.prev = prev;
            prev = newNode;
        }
        return head;
    }

    // Print DLL
    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find pairs with given sum in DLL (Sorted DLL)
    public static void findPairsWithSum(Node head, int target) {
        if (head == null) return;

        Node left = head;
        Node right = head;

        // Move right pointer to last node
        while (right.next != null) {
            right = right.next;
        }

        System.out.println("Pairs with sum " + target + ":");

        // Two pointer approach
        while (left != null && right != null && left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {
                System.out.println("(" + left.data + ", " + right.data + ")");
                left = left.next;
                right = right.prev;
            }
            else if (sum < target) {
                left = left.next;
            }
            else {
                right = right.prev;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9};
        Node head = arrayInToDLL(arr);

        int target = 7;
        findPairsWithSum(head, target);
    }
}
