package List;

public class findmidoflist {
	
	public static ListNode mid(ListNode head) {
		   ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {

	            slow = slow.next;
	            fast = fast.next.next;

	        }

	        return slow;
	    }
	
	public static void printList(ListNode head) {
		while(head != null) {
			System.out.print(head.val+ " ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static void main (String args[]) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(1);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(3);
		ListNode result=mid(head);
		printList(result);
}
}