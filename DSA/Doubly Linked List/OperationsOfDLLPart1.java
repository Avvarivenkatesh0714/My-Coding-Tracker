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

public class OperationsOfDLLPart1 {

    public static Node arrayInToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        // Build the doubly linked list
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.prev = prev;
            prev = temp;
        }
        return head; // ✅ Return head
    }

    public static void printLL(Node head) {
        System.out.print("Forward: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public static Node deleteHeadDLL(Node head){
      if(head == null || head.next == null) return null;
      // ✅ Delete head
       Node prev = head;
       head = head.next;
       prev.next = null;         
       head.prev = null; 
       return head;
    }
    
    public static Node deleteTailDLL(Node head){
      if(head == null || head.next == null) return null;
      // ✅ Delete head
       Node temp = head;
       Node prev = head;
       while(temp.next != null){
         prev = temp;
         temp = temp.next;
       }
       prev.next = null;
       temp.prev = null;
       return head;
    }
    
    public static Node deleteKthNodeDLL(Node head, int k) {
    if (head == null) return null;

    // Case 1: delete head
    if (k == 1) {
        return deleteHeadDLL(head);
    }

    Node temp = head;
    int cnt = 1;

    // Traverse to kth node
    while (temp != null && cnt < k) {
        temp = temp.next;
        cnt++;
    }

    // If k is out of bounds
    if (temp == null) {
        return head;
    }

    // Case 2: delete last node
    if (temp.next == null) {
        return deleteTailDLL(head);
    }

    // Case 3: delete middle node
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;

    // Clear deleted node links (optional clean-up)
    temp.next = null;
    temp.prev = null;

    return head;
}

    public static Node insertNodeAtHead(int val, Node head){
    Node newHead = new Node(val);
    if(head != null){
        head.prev = newHead;
        newHead.next = head;
    }
    return newHead;
}

public static Node insertNodeAtTail(int val, Node head){
    Node newNode = new Node(val);
    if(head == null) return newNode;

    Node temp = head;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.prev = temp;

    return head;
}

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
      
        Node head = arrayInToLL(arr);
        // int k = 1;
        int val = 7;
        // Node res = deleteHeadDLL(head);
        // Node res = deleteTailDLL(head);
        // Node res = deleteKthNodeDLL(head, k);
        // Node res = insertNodeAtHead(val,head);
           Node res = insertNodeAtTail(val,head);
        printLL(res);  // Print updated list
    }
}
