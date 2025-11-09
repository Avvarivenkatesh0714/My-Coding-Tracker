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

public class OperationsOfDLLPart2 {

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

    public static Node insertNodeBeforeTailNode(int val, Node head){
    // If list has 0 or 1 node, inserting before tail is same as inserting at head
    if(head == null || head.next == null){
        return null;
    }

    Node temp = head;

    // move to tail
    while(temp.next != null){
        temp = temp.next;
    }

    Node tail = temp;           // last node
    Node secondLast = tail.prev;

    Node newNode = new Node(val);

    // Link newNode
    newNode.next = tail;
    newNode.prev = secondLast;
    secondLast.next = newNode;
    tail.prev = newNode;

    return head;
}
    
    public static Node insertNodeBeforeKthNode(int val, int k, Node head){
      
           Node temp = head;
           int cnt = 0;
           
           while(temp != null){
             cnt++;
             if(cnt == k){
                Node curr = temp;
                Node currBack = curr.prev;
                
                Node newNode = new Node(val);
                
                newNode.next = curr;
                newNode.prev = currBack;
                
                currBack.next = newNode;
                curr.prev = newNode;
             }
             temp = temp.next;
           }
           return head;
    }
    
    public static Node reverseDLL(Node head){
        
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
           temp.data = st.pop();
           temp = temp.next;
        }
        return head;
        
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
      
        Node head = arrayInToLL(arr);
        
        int val = 7;
        int k = 3;
        // Node res = insertNodeBeforeTailNode(101, head);
        // Node res = insertNodeBeforeKthNode(val,k,head);
        Node res = reverseDLL(head);
        printLL(res);  // Print updated list
    }
}