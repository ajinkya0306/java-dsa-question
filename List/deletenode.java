package List;

public class deletenode {
	 public static void deleteNode(ListNode node) {

	        ListNode prev = null;

	        while (node != null && node.next != null) {
	            node.val = node.next.val;   // Copy next node's value

	            prev = node;                // Store previous node
	            node = node.next;           // Move to next node
	        }

	        prev.next = null;               // Remove last node
	    }
	    // Method to print the linked list
	    public static void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val);

	            if (head.next != null) {
	                System.out.print(" -> ");
	            }

	            head = head.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        // Create linked list: 4 -> 5 -> 1 -> 9
	        ListNode head = new ListNode(4);
	        head.next = new ListNode(5);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(9);

	        System.out.println("Before deleting:");
	        printList(head);

	        // We want to delete node with value 5
	        deleteNode(head.next);

	        System.out.println("After deleting:");
	        printList(head);
	    }

}
