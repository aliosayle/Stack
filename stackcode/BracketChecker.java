package stackcode;

public class BracketChecker {
    public static boolean check(String expression) {
        Stack stack = new Stack();
        
        for (int i = 0; i < expression.length(); i++) { //we create a loop that will iterate between all the characters of the String
            char c = expression.charAt(i);
            if (c == '(') {
                stack.push(c); //we add the opening brackets to the stack
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; //return false if the stack has no opening brackets and it finds a closing bracket
                }
                char top = stack.pop(); //if stack is not empty it means the two brackets are balanced, we pop them
                if (c == ')' && top == ')') {
                    return false; //return false if they don't match
                }
            }
        }
        
        return stack.isEmpty(); //if the stack is empty it means that all the brackets cancel each other out and are balanced
    }
    
    public static void main(String[] args) {
        String expression1 = "(((a+b)*c)+(u*v))";
        String expression2 = "(a+b)*c)";
        String expression3 = "(a+b)*)c+b(";
        
        System.out.println(check(expression1)); // true
        System.out.println(check(expression2)); // false
        System.out.println(check(expression3)); // false
    }
}
