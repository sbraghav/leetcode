class Solution {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        mergeTwoLists(list1, list2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode itr =  result;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                itr.next = new ListNode(list2.val);
                list2 = list2.next;
            } else {
                itr.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            itr = itr.next;
        }
        itr.next = list1 == null ? list2 : list1;
        return result.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}