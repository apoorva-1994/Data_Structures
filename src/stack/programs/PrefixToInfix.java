package stack.programs;
import java.util.Stack;
public class PrefixToInfix {
		
	public static void prefixToinfix(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<String> st = new Stack<>();
		int l = s.length();String temp = "";
		for(int i = l-1 ; i >= 0 ; i--) {
			char c = s.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
				st.push(c+"");
			}else {
					String d = st.pop();
					String e = st.pop();
					temp = "(" + d + c + e + ")";
					st.push(temp);
			}
		}
		while(st.isEmpty() == false) {
			sb.append(st.pop());
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {  
		String s = "*-A/BC-/AKL";
		prefixToinfix(s);
	}
}
