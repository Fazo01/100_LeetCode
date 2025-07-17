import java.util.Stack;

public class _02_Valid_Parentheses {
    public static boolean isValid(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if (c=='('||c=='{'||c=='['){
                stack.push(c);//we got opening symbolls here['(']
            }else {
                if(stack.isEmpty()) return false;
                char top=stack.pop();
                if ((c==')'&& top!='(')||(c=='}'&& top!='{'||c==']'&& top!='[')){
                    //here we got the closing [')'] , if the top symbols matches with closing symbols
                    //top will pop the opening symbol and condition becomes true now stack is empty []
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));      // true
        System.out.println(isValid("()[]{}"));  // true
        System.out.println(isValid("(]"));      // false
        System.out.println(isValid("([])"));    // true

    }
}
