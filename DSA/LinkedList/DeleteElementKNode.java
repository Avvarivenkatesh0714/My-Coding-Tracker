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

public class DeleteElementKNode {

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
    public static Node deleteElementKNode(Node head, int ele) {
        
        if(head == null) return head;
        
        if(head.data == ele){
          Node temp = head;
          return head;
        }
        
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
          
          if(temp.data == ele){
            prev.next = prev.next.next;
            break;
          }
          
          prev = temp;
          temp = temp.next;
        }
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

        head = deleteElementKNode(head, 8); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}
