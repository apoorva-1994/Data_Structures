package stack.programs;
import java.util.Stack;
public class ValidParenthesis {
	
	public static boolean validParenthesis(String s) {
		boolean isvalid = false;
		Stack<Character> st = new Stack<Character>();
	       for(int i = 0 ; i < s.length() ; i++){
	           if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
	               st.push(s.charAt(i));
	           }
	           else if(s.charAt(i)==']' && st.peek() == '['){
	               st.pop();
	           }
	           else if(s.charAt(i)=='}' && st.peek() == '{'){
	                st.pop();
	           }
	           else if(s.charAt(i)==')' && st.peek() == '('){
	               st.pop();
	           }
	       }
	       if(st.isEmpty()){
	           isvalid = true;
	           return isvalid;
	       }
	       return isvalid;
	}

	public static void main(String[] args) {
		String ss = "[()]{}{[()()]()}" ;
		validParenthesis(ss);
	}

}
