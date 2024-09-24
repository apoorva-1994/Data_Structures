package stack.programs;
import java.util.Stack;
public class ReverseStackUsingRec {
	
	public static void placeAtBottom(int top, Stack<Integer> st) {
		if(st.isEmpty()) {
			st.push(top);
			return;
		}
		int m = st.pop();
		placeAtBottom(top, st);
		st.push(m);
	}
	
	public static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int top = st.pop();
		reverse(st);
		placeAtBottom(top,st);
	}
	
	public static void main(String[] args) {  
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		reverse(st);
	}

}
