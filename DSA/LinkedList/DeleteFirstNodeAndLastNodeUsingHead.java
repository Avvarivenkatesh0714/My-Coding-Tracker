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

public class DeleteFirstNodeAndLastNodeUsingHead {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to delete the first node
    public static Node deleteFirstNode(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }
    
    public static Node deleteTailNode(Node head){
      if(head==null || head.next==null) return null;
      
      Node temp = head;
      
      while(temp.next.next != null){
        temp = temp.next;
      }
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

        // Delete first node
        //head = deleteFirstNode(head);

        // System.out.println("After Deleting First Node:");
        // print(head);
        
        head = deleteTailNode(head);

        System.out.println("After Deleting First Node:");
        print(head);
    }
}
