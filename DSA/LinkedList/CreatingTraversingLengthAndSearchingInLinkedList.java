// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node {
    int data;
    Node next;

    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class CreatingTraversingLengthAndSearchingInLinkedList {

    // Function to check if a value is present in the LinkedList
    public static int checkIfPres(Node head, int val) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    // Function to find the length of LinkedList
    public static int lengthOfLinkedList(Node head) {
        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        // Convert array to LinkedList using a for loop
        Node head = new Node(arr[0]);   // First node
        Node mover = head;              // Pointer to track last node

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);  // Create new node
            mover.next = temp;             // Link it
            mover = temp;                  // Move pointer
        }

        int val = 8;
        System.out.println("Length of LinkedList: " + lengthOfLinkedList(head));
        System.out.println("Is " + val + " present? " + (checkIfPres(head, val) == 1 ? "Yes" : "No"));
    }
}
