package complex;

import java.util.Map;
import java.util.Stack;

/*
Input: exp = “[()]{}{[()()]()}”
Output: true
Explanation: all the brackets are well-formed

Input: exp = “[(])”
Output: false
Explanation: 1 and 4 brackets are not balanced because
there is a closing ‘]’ before the closing ‘(‘
 */
public class Question63 {

    public static void main(String[] args) {
        final String input1 = "[()]{}{[()()]()}[]";
        final String input2 = "[(])";
        final String input3 = "[()]{}{[()()]()}[";
        final String input4 = "[()]{}{[()()]()}[[";
        System.out.println(checkForMatchingParanthesis(input1));
        System.out.println(checkForMatchingParanthesis(input2));
        System.out.println(checkForMatchingParanthesis(input3));
        System.out.println(checkForMatchingParanthesis(input4));
    }

    private static boolean checkForMatchingParanthesis(String input) {
        if(input.length()%2!=0)
            return false;
        Map<String, String> matchingParantheses = Map.of("(", ")",
                "{", "}",
                "[", "]");
        Stack<String> stack = new Stack<>();
        for (String letter : input.split("")) {
            if (matchingParantheses.containsKey(letter)) {
                stack.push(letter);
            } else if( !matchingParantheses.get(stack.pop()).equals(letter))
                    return false;
        }
        return stack.size()==0;
    }
}
