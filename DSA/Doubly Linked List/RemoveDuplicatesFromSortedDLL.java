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

public class RemoveDuplicatesFromSortedDLL {

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
    public static Node removeDuplicatesFromSortedDLL(Node head) {
        
        Node temp = head;
        
        while(temp != null && temp.next != null){
          Node nextNode = temp.next;
          while(temp.data == nextNode.data && nextNode != null){
            nextNode = nextNode.next;
          }
          temp.next = nextNode;
          nextNode.prev = temp;
          temp = temp.next;
        }
        
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 4};
        Node head = arrayInToLL(arr);

        head = removeDuplicatesFromSortedDLL(head);

        printLL(head); // Output: 1 3 4 5
    }
}