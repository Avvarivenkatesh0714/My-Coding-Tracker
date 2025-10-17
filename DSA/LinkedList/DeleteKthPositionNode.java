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

    // Function to delete the tail node
    public static Node deleteKthPostionNode(Node head, int k) {
        
        if(head == null) return head;
        
        if(k == 1){
          Node temp = head;
          return head;
        }
        
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
          
          cnt++;
          
          if(cnt == k){
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

        head = deleteKthPostionNode(head, 3); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}
