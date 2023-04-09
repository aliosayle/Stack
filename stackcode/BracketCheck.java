package stackcode;

public class Test {
    public static boolean check(String exp)
    {
        Stack s = new Stack();
        for(int i = 0; i < exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(c == '(')
            s.push(c);
            else if(c == ')')
                if(s.isEmpty())
                return false;
                else
                s.pop();
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "(((a+b)*c)+(u*v))";
        String expression2 = "(a+b)*c)";
        String expression3 = "(a+b)*)c+b(";
        String expression4 = "a + (2b + (d))";
        
        System.out.println(check(expression1)); // true
        System.out.println(check(expression2)); // false
        System.out.println(check(expression3)); // false
        System.out.println(check(expression4)); // true
    }
}
