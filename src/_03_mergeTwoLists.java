// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class _03_mergeTwoLists {

    // Merge method (recursive)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {//Important
        if (list1 == null) return list2;
        if (list2==null) return list1;
        if(list1.val< list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
        else {
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
    // Utility: Convert array to linked list
    public static ListNode buildList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Utility: Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method: test cases
    public static void main(String[] args) {
        _03_mergeTwoLists solution = new _03_mergeTwoLists();

        // Test Case 1: [1, 2, 4] + [1, 3, 4]
        ListNode list1 = buildList(new int[]{1, 2, 4});
        ListNode list2 = buildList(new int[]{1, 3, 4});
        ListNode merged1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Merged List 1: ");
        printList(merged1);  // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Test Case 2: [] + []
        ListNode merged2 = solution.mergeTwoLists(null, null);
        System.out.print("Merged List 2: ");
        printList(merged2);  // Output: (empty)

        // Test Case 3: [] + [0]
        ListNode list3 = buildList(new int[]{});
        ListNode list4 = buildList(new int[]{0});
        ListNode merged3 = solution.mergeTwoLists(list3, list4);
        System.out.print("Merged List 3: ");
        printList(merged3);  // Output: 0
    }
}
