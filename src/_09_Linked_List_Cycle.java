public class _09_Linked_List_Cycle {
    class ListNode01 {
        int val;
        ListNode01 next;
        ListNode01(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode01 head) {
            if(head==null && head.next==null) return false;
            ListNode01 slow=head;
            ListNode01 fast=head;
            while (fast!=null&&fast.next!=null){
                slow=head.next;
                fast=head.next.next;
                if (slow==fast){
                    return true;
                }
            }
            return false;
        }
    }
}
