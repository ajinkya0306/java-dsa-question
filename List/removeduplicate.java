package List;

public class removeduplicate {

	public static ListNode duplicate(ListNode head) {
		ListNode current = head;
		while(current!= null && current.next!=null) {
			if(current.val==current.next.val) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
		return head;
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
		ListNode result=duplicate(head);
		printList(result);
	}
}
