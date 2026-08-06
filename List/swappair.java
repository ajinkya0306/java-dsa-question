package List;

public class swappair {

	public static ListNode reverse(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode temp=head.next;
		head.next=reverse(head.next.next);
		temp.next=head;
		
		return temp;
	}
	 public static void printList(ListNode head) {

	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }

	        System.out.println();
	    }
	 
	public static void main (String args[]) {
		ListNode head=new ListNode(1);
		 head.next=new ListNode(2);
		 head.next.next=new ListNode(3);
		 head.next.next.next =new ListNode(4);
		 ListNode result=reverse(head);
		 printList(result);
	}
}   
