public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        Set<ListNode> nodes = new HashSet<ListNode>();
        while(node != null){
            if(nodes.contains(node)){
                return true;
            }
            nodes.add(node);
            node = node.next;
        }
        return false;
    }
}