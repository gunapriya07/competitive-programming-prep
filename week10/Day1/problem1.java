//Problem -1 : Reverse Linked List

// Given the head of a singly linked list, reverse the list, and return the reversed list.

//Solution:


class problem1 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
