package List;

public class mergeksortedlists {
	  // ListNode class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    // Function 1: Merge two sorted linked lists
    static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } 
        else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }


    // Function 2: Divide and merge
    static ListNode partitionAndMerge(int start, int end, ListNode[] lists) {

        if (start > end)
            return null;

        if (start == end)
            return lists[start];

        int mid = start + (end - start) / 2;

        ListNode l1 = partitionAndMerge(start, mid, lists);

        ListNode l2 = partitionAndMerge(mid + 1, end, lists);

        return mergeTwoSortedLists(l1, l2);
    }


    // Function 3: Merge K lists
    static ListNode mergeKLists(ListNode[] lists) {

        int k = lists.length;

        if (k == 0)
            return null;

        return partitionAndMerge(0, k - 1, lists);
    }


    // Create linked list from array
    static ListNode createList(int[] arr) {

        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }


    // Print linked list
    static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }


    // Main method
    public static void main(String[] args) {

        // Create 3 sorted linked lists
        ListNode l1 = createList(new int[]{1, 4, 5});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode l3 = createList(new int[]{2, 6});

        // Store them in an array
        ListNode[] lists = {l1, l2, l3};

        // Merge all lists
        ListNode result = mergeKLists(lists);

        // Print result
        System.out.println("Merged List:");
        printList(result);
    }
}
