package List;

public class Rotatelist {

	public static ListNode rotate(ListNode head,int k) {
		if(head==null || head.next==null || k==0) {
			return head;
		}
		//find length
		int length=1;
		ListNode tail=head;
		while(tail.next !=null) {
			tail=tail.next;
			length++;
		}
		
		k=k%length;
		if(k==0) {
			return head;
		}
		//create circular list by attach tail to head
		tail.next=head;
		//find tail for new list
		int step=length-k;
		ListNode newtail=head;
		for(int i=1;i<step;i++) {
			newtail=newtail.next;
		}
		
		ListNode newhead=newtail.next;//assign newhead
		//break circular
		newtail.next=null;
		
		return newhead;
	}
		 public static void printList(ListNode head) {
		        while (head != null) {
		            System.out.print(head.val + " ");
		            head = head.next;
		        }
		}
	
	public static void main(String args[]) {
		ListNode head= new ListNode(1);
		head.next= new ListNode(2);
		head.next.next= new ListNode(3);
		head.next.next.next= new ListNode(4);
		head.next.next.next.next= new ListNode(5);
		int k=2;
		ListNode result=rotate(head,k);
		printList(result);
		
		
	}
}
