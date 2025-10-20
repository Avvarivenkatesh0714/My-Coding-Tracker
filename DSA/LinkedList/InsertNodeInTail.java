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

public class InsertNodeInTail {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node insertNodeInTail(Node head, int val) {
      if(head == null) return new Node(val);
      
        
        Node temp = head;
        while(temp.next != null){
          temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
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

        head = insertNodeInTail(head, 100); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}