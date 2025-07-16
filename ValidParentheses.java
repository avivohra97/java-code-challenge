import java.util.Stack;

public class ValidParentheses {
    public String isValid(String s) {
        char[] chr = s.toCharArray();
        Stack<Character> stk = new Stack<>();
        String start = "([{";
        String end = ")}]";
        for(char c:chr){
            if(start.indexOf(c)!=-1){
                stk.push(c);
            }else if(end.indexOf(c)!=-1){
                if(c == ')' && stk.peek() != '(') return "NO";
                if(c == '}' && stk.peek() != '{') return "NO";
                if(c == ']' && stk.peek() != '[') return "NO";
                stk.pop();
            }
        }
        if(!stk.isEmpty()) return "NO";
        return "YES";
    }


}
