import java.util.*;
class MyQueue {
Stack<Integer> pushStack;
Stack<Integer> popStack; 
    public MyQueue() {
           pushStack = new Stack<Integer>();
           popStack = new Stack<Integer>();
        }
    
    public void push(int x) {
        pushStack.push(x);
    }
    
    public int pop() {
        if(popStack.size() == 0){
            while(pushStack.size() > 0){
            popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }
    
    public int peek() {
        int num = pop();
        popStack.push(num);
        return num;
    }
    
    public boolean empty() {
        return pushStack.size() == 0 && popStack.size() == 0;
    }
}