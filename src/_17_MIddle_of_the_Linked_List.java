public class _17_MIddle_of_the_Linked_List {
    class ListNode04 {
        int val;
        _17_MIddle_of_the_Linked_List.ListNode04 next;
        ListNode04(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode04 middleNode(ListNode04 head){

        ListNode04 slow01 =head;
        ListNode04 fast01=head;
        while(fast01!=null&&fast01.next!=null){
            slow01=slow01.next;
            fast01=fast01.next.next;

        }
        return slow01;
    }
}
