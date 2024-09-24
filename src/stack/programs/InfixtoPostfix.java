package stack.programs;
import java.util.Stack;
public class InfixtoPostfix {
	
	public static int prec(Character c) {
		if(c=='^') {
			return 3;
		}else if(c == '*' || c == '/') {
			return 2;
		}else if(c == '+' || c == '-') {
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void infixToPostfix(String s) {	
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				sb.append(c);
			}else if(c == '(') {
				st.push(c);
			}else if (c == ')') {
				while(!st.isEmpty() && st.peek()!='(') {
					sb.append(st.pop());
				}
				st.pop();
			}else {
				while (st.isEmpty() == false && (prec(st.peek()) > prec(c) || prec(st.peek()) == prec(c))) {
					sb.append(st.pop());
				}
				st.push(c);
			}
		}
		while (st.isEmpty() == false) {
			sb.append(st.pop());
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {  
		String s = "a+b*(c^d-e)^(f+g*h)-i";
		infixToPostfix(s);
		
	}

}
