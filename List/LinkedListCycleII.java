package List;

public class LinkedListCycleII {
	public static ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                ListNode p = head;

                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }

                return p;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Create linked list
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create cycle: 4 -> 2
        node4.next = node2;

        // Detect cycle
        ListNode result = detectCycle(node1);

        if (result != null) {
            System.out.println("Cycle starts at node: " + result.val);
        } else {
            System.out.println("No cycle");
        }
    }
}
