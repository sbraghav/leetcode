class Solution {
    public Stack<ListNode> populateStack(Stack<ListNode> stack, ListNode node){
        ListNode n = node;
        while(n != null){
            stack.push(n);
            n = n.next;
        }
        return stack;
    }

    public int addNodes(int num1, int num2, int carry, Stack<ListNode> stack){
            int sum = (num1 + num2 + carry ) % 10;
            stack.push(new ListNode(sum));
            return (num1 + num2 + carry ) / 10;
    }

    public Stack<ListNode> addStacks(Stack<ListNode> stack1, Stack<ListNode> stack2){
        Stack<ListNode> result = new Stack<ListNode>();
        int carry = 0;
        while(stack1.size() > 0 && stack2.size() > 0){
            int num1 = stack1.pop().val;
            int num2 = stack2.pop().val;
            carry = addNodes(num1, num2, carry, result);
        }
        while(stack1.size() > 0){
            int num1 = stack1.pop().val;
            int num2 = 0;
            carry = addNodes(num1, num2, carry, result);
        }
        while(stack2.size() > 0){
            int num1 = 0;
            int num2 = stack2.pop().val;
            carry = addNodes(num1, num2, carry, result);
        }
        if(carry == 1){
            result.push(new ListNode(carry));
        }
        return result;
    }

    public ListNode resultStacktoList(Stack<ListNode> result){
        ListNode head = result.pop();
        ListNode prev = head;
        ListNode node = head;
        while(result.size() > 0){
            node = result.pop();
            prev.next = node;
            prev = node;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<ListNode>();
        Stack<ListNode> s2 = new Stack<ListNode>();
        Stack<ListNode> result;

        populateStack(s1, l1);
        populateStack(s2, l2);
        result = addStacks(s1, s2);

        return resultStacktoList(result);
    }
}