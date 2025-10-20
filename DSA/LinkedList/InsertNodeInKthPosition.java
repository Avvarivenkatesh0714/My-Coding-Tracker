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

public class InsertNodeInKthPosition {

    // Function to print linked list
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node InsertNodeInKthPosition(Node head, int ele,int k) {
      if(head == null) {
        if(k==1)
        return new Node(ele);
      }
      
      if(k==1){
        return new Node(ele,head);
      }
      
        int cnt = 0;
        Node temp = head;
      
        while(temp != null){
          cnt++;
          if(cnt==k-1){
            Node x = new Node(ele, temp.next);
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

        head = InsertNodeInKthPosition(head, 100, 3); // update head after deletion

        System.out.println("After deleting tail node:");
        print(head);
    }
}