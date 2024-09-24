package stack.programs;
import java.util.Stack;
public class PostfixtoInfix {
		
	public static void postfixToinfix(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<String> st = new Stack<>();
		int l = s.length();String temp = "";
		for(int i = 0 ; i < l ; i++) {
			char c = s.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				st.push(c+"");
			}else {
					String d = st.pop();
					String e = st.pop();
					temp = "(" + e + c + d + ")";
					st.push(temp);
			}
		}
		while(st.isEmpty() == false) {
			sb.append(st.pop());
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {  
		String s = "ab*c+";
		postfixToinfix(s);
	}
}
