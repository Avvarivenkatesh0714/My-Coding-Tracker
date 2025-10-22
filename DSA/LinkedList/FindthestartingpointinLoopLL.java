/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//Brute Force
public class FindthestartingpointinLoopLL {
    public ListNode detectCycle(ListNode head) {
        
        ListNode temp = head;
        Map<ListNode, Integer> map = new HashMap<>();

        while(temp != null){

            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,1);
            temp = temp.next;
        }
        return null;
    }
}
// //Optimal Approach
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
        
//         ListNode slow = head;
//         ListNode fast = head;
        
//         while(fast != null && fast.next != null){
//             slow = slow.next;        
            
//             // Move fast two steps
//             fast = fast.next.next;  
    
//             // If slow and fast meet,
//             // a loop is detected
//             if (slow == fast) {
//                 // Reset the slow pointer
//                 // to the head of the list
//                 slow = head; 
    
//                 // Phase 2: Find the first node of the loop
//                 while (slow != fast) {
//                     // Move slow and fast one step
//                     // at a time
//                     slow = slow.next;  
//                     fast = fast.next;  
    
//                     // When slow and fast meet again,
//                     // it's the first node of the loop
//                 }
                
//                 // Return the first node of the loop
//                 return slow;  
//             }
//         }
        
//         // If no loop is found, return null
//         return null; 
//             }
//         }
    