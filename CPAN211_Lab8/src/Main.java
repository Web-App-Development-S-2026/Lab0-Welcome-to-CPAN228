import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].trim().isEmpty()) {
            System.err.println("Usage: java Main \"<postfix expression>\"");
            System.err.println("Example: java Main \"1 2 + 3 *\"");
            System.exit(1);
        }

        String expression = args[0];
        System.out.println("Evaluating: " + expression);

        try {
            double result = evaluatePostfix(expression);
            System.out.println("Result: " + formatResult(result));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }

    /**
     * Evaluates a postfix expression and returns the result.
     *
     * @param expr The postfix expression string.
     * @return The evaluation result as a double.
     * @throws IllegalArgumentException if the expression is malformed or contains invalid tokens.
     * @throws ArithmeticException if division or modulo by zero occurs.
     */
    public static double evaluatePostfix(String expr) {
        Stack<Double> stack = new Stack<>();
        // Split by one or more whitespace characters
        String[] tokens = expr.trim().split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            }

            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Insufficient operands for operator '" + token + "'.");
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = applyOperator(token, operand1, operand2);
                stack.push(result);
            } else {
                try {
                    double value = Double.parseDouble(token);
                    stack.push(value);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Token '" + token + "' is not a valid number or operator.");
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Too many operands remaining on the stack.");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%");
    }

    private static double applyOperator(String operator, double op1, double op2) {
        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                if (op2 == 0) {
                    throw new ArithmeticException("Division by zero.");
                }
                return op1 / op2;
            case "%":
                if (op2 == 0) {
                    throw new ArithmeticException("Modulo by zero.");
                }
                return op1 % op2;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static String formatResult(double val) {
        if (val == (long) val) {
            return String.valueOf((long) val);
        } else {
            return String.valueOf(val);
        }
    }
}