import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] s
                = { "10", "6", "9",  "3", "+", "-11", "*",
                "/",  "*", "17", "+", "5", "+" };

        int result = evaluateString(s);
        System.out.println(result);
    }
    public static int evaluateString(String s[]){
        int result = 0;
        String ops = "+-*/";
        Stack<String> stk = new Stack<>();
        for(String c:s){

            if(ops.indexOf(c) == -1){
                stk.push(c);
            }else{
                if(stk.isEmpty()!= true){
                    int a = Integer.valueOf(stk.pop());
                    int b = Integer.valueOf(stk.pop());
                    int postOps = 0;
                    switch (c){
                        case "+":
                            postOps = a+b;
                            break;
                        case "-":
                            postOps = a-b;
                            break;
                        case "*":
                            postOps = a*b;
                            break;
                        case "/":
                            postOps = a/b;
                            break;
                        default:
                            break;

                    }
                    stk.push(String.valueOf(postOps));
                }
            }
        }
        if(stk.isEmpty()){
            return  result;
        }else{
            result = Integer.valueOf(stk.pop());
        }

        return result;
    }
}
