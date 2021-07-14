import java.util.SortedMap;

public class QuotesChecker {
    private String expression;
    private int expSize;
    private MyStack stack;

    // Constructor to initialize QuotesChecker object
    public QuotesChecker(String exp) {
        expression = exp;
        expSize = expression.length();
        stack = new MyStack(expSize);
    }

    // checkQuotes method: returns true if quotes are correct in the expression
    public boolean checkQuotes() {
        if(expSize == 0) {
            return true;
        }
        for (int i = 0; i < expSize; ++i) {
            char elm = expression.charAt(i);
            if(elm == '(') {
                stack.push(elm);
            } else if(elm == ')') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
