package List;

import java.util.Stack;

public class MaximumTwinSumofaLinkedList {

    public static int pairSum(ListNode head) {

        Stack<Integer> st = new Stack<>();

        // Put all values into stack
        ListNode curr = head;

        while (curr != null) {
            st.push(curr.val);
            curr = curr.next;
        }

        int n = st.size();

        curr = head;

        int count = 1;
        int result = 0;

        // Process only first half
        while (count <= n / 2) {

            result = Math.max(result, curr.val + st.pop());

            curr = curr.next;

            count++;
        }

        return result;
    }


// Main method
public static void main(String[] args) {

    // Create linked list:
    // 4 -> 2 -> 2 -> 3

    ListNode head = new ListNode(4);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);

    // Create Solution object
   

    // Call pairSum()
    int result = pairSum(head);

    // Print answer
    System.out.println("Maximum Twin Sum = " + result);
}
}
