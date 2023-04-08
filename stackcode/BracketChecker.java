package stackcode;

public class BracketChecker {
    public static boolean check(String expression) {
        Stack stack = new Stack();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
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
