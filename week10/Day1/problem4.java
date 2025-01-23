// Problem 4: Remove Nth Node From End of List

// Given the head of a linked list, remove the nth node from the end of the list and return its head.
class problem4 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0,head);
        ListNode dummy = res;
        for(int i =0;i<n;i++){
            head = head.next;
        }
        while(head != null){
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return res.next;
    }
}