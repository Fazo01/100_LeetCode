
// Definition for singly-linked list
class ListNode02 {
    int val;
    ListNode02 next;

    // Constructors
    ListNode02() {}
    ListNode02(int val) { this.val = val; }
    ListNode02(int val, ListNode02 next) { this.val = val; this.next = next; }
}

public class _12_Reverse_Linked_List {

    // Method to reverse the linked list (iterative)
    public static ListNode02 reverseList(ListNode02 head) {

        return prev;
    }

    // Helper method to print the list
    public static void printList(ListNode02 head) {
        ListNode02 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode02 head = new ListNode02(1);
        head.next = new ListNode02(2);
        head.next.next = new ListNode02(3);
        head.next.next.next = new ListNode02(4);
        head.next.next.next.next = new ListNode02(5);

        System.out.println("Original List:");
        printList(head);

        ListNode02 reversed = reverseList(head);

        System.out.println("Reversed List:");
        printList(reversed);
    }
}

