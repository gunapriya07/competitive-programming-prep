// https://leetcode.com/problems/swap-nodes-in-pairs/description/

// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]

// Input: head = []
// Output: []

// Input: head = [1]
// Output: [1]

// Input: head = [1,2,3]
// Output: [2,1,3]

// Constraints:
// The number of nodes in the list is in the range [0, 100].
// 0 <= Node.val <= 100


class Swapnodes {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, cur = head;

        while (cur != null && cur.next != null) {
            ListNode npn = cur.next.next;
            ListNode second = cur.next;

            second.next = cur;
            cur.next = npn;
            prev.next = second;

            prev = cur;
            cur = npn;
        }

        return dummy.next;        
    }
}