class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;
        ListNode next = null;

        while(node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}