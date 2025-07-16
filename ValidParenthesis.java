public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParentheses checker = new ValidParentheses();
        System.out.println("() is valid: " + checker.isValid("()"));          // true
        System.out.println("()[]{} is valid: " + checker.isValid("()[]{}"));  // true
        System.out.println("(] is valid: " + checker.isValid("(]"));          // false
        System.out.println("([)] is valid: " + checker.isValid("([)]"));      // false
        System.out.println("{[]} is valid: " + checker.isValid("{[]}"));      // true
        System.out.println(" is valid: " + checker.isValid(""));             // true (empty string is valid)
    }
}
