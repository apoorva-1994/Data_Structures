package stack.programs;
import java.util.Stack;
public class ReverseAStack {
	public static void pushAtBottom(Stack<Integer> st,int s) {
		if(st.isEmpty()) {
			st.push(s);
			return;
		}
		int top = st.pop();
		pushAtBottom(st, s);
		st.push(top);
		
	}
	
	public static void reverseStack(Stack<Integer> st) {
			if(st.isEmpty()) {
				return;
			}
			int top = st.pop();
			reverseStack(st);
			pushAtBottom(st, top);
	}
	   
	public static void main(String[] args) {
	       Stack<Integer> st = new Stack<>();
	       st.push(1);
	       st.push(2);
	       st.push(3);
	       reverseStack(st);
	  }

}
