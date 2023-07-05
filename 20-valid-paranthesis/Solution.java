import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        List<Character> OPEN_PARENTHESES = Arrays.asList('(','[','{');
        HashMap<Character, Character> openCloseMaps = new HashMap<>();
        openCloseMaps.put('}','{');
        openCloseMaps.put(']','[');
        openCloseMaps.put(')','(');
        Stack<Character> stack = new Stack<Character>();
        for(Character c:s.toCharArray()){
            if(OPEN_PARENTHESES.contains(c)){
                stack.push(c);
            }else {
                if(stack.size() > 0){
                    Character matchingBracket = stack.pop();
                    if(! matchingBracket.equals(openCloseMaps.get(c))){
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}