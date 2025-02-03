import java.util.Stack;

public class EvaluatingReversePolishNotation {

    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){
            if(isOperand(token)){
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperand(token,a,b);
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperand(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private int applyOperand(String token, int a, int b){
        switch (token){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/": return a/b;
            default: throw new IllegalArgumentException("Invalid Operator");
        }
    }

}
