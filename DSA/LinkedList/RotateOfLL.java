import java.util.*;

class Node{
  int data;
  Node next;
  
  Node(int data1, Node next1){
    this.data=data1;
    this.next=next1;
  }
  
  Node(int data1){
    this.data=data1;
    this.next=null;
  }
}

public class RotateOfLL {
  //Brute Force Approach
    public static Node rotateOfLL(Node head, int k) {
    if (head == null || head.next == null || k == 0) return head;

    // Find length and last node
    Node tail = head;
    int len = 1;
    while (tail.next != null) {
        tail = tail.next;
        len++;
    }

    // Make circular
    tail.next = head;

    // Effective rotation
    k = k % len;
    if (k == 0) {
        tail.next = null; // break circle
        return head;
    }

    int stepsToNewHead = len - k;
    Node temp = head;

    // Move to the new tail
    for (int i = 1; i < stepsToNewHead; i++) {
        temp = temp.next;
    }

    // temp is new tail
    Node newHead = temp.next;
    temp.next = null;

    return newHead;
}

    public static void printList(Node head) {
    Node temp = head;
    while(temp != null) {
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
    
    Node res = rotateOfLL(head, 2);
    printList(res);
}

}