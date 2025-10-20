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

public class InsertValueBeforeElement {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node InsertNodeInKthPosition(Node head, int val,int ele) {
      if(head == null) {
       
        return null;
      }
      
      if(head.data==ele){
        return new Node(ele,head);
      }
      
        
        Node temp = head;
      
        while(temp != null){
          
          if(temp.next.data==ele){
            Node x = new Node(val, temp.next);
            temp.next = x;
            break;
          }
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

        head = InsertNodeInKthPosition(head, 100, 5); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}