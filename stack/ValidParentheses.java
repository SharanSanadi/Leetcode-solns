import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                // If closing bracket and stack is empty
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty at end
        return stack.isEmpty();
    }
}
