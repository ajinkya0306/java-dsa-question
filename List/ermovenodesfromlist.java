package List;

public class ermovenodesfromlist {
	  public static ListNode removeNodes(ListNode head) {

	        head = reverse(head);

	        int max = head.val;
	        ListNode curr = head;

	        while (curr != null && curr.next != null) {

	            if (curr.next.val < max) {
	                curr.next = curr.next.next;
	            } else {
	                curr = curr.next;
	                max = curr.val;
	            }
	        }

	        return reverse(head);
	    }

	    private static ListNode reverse(ListNode head) {

	        ListNode prev = null;
	        ListNode curr = head;

	        while (curr != null) {

	            ListNode next = curr.next;

	            curr.next = prev;

	            prev = curr;

	            curr = next;
	        }

	        return prev;
	    }

	 static void print(ListNode head) {

	        while (head != null) {
	            System.out.print(head.val);

	            if (head.next != null)
	                System.out.print(" -> ");

	            head = head.next;
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) {

	        ListNode head = new ListNode(5);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(13);
	        head.next.next.next = new ListNode(3);
	        head.next.next.next.next = new ListNode(8);

	        System.out.println("Original List:");
	        print(head);

	        

	        head = removeNodes(head);

	        System.out.println("After Removing:");
	        print(head);
	    }
}
