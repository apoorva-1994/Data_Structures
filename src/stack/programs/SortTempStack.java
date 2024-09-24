package stack.programs;
import java.util.Stack;
public class SortTempStack {
		
	public static Stack<Integer> sortStack(Stack<Integer> st) {	
		Stack<Integer> temp_st = new Stack<>();
		while(!st.isEmpty()) {
			int m = st.pop();
			while(!temp_st.isEmpty() && temp_st.peek() < m) {
				st.push(temp_st.pop());
			}
			temp_st.push(m);
		}
		return temp_st;
	}
	
	public static void main(String[] args) {   
		Stack<Integer> st = new Stack<>();
		st.push(4);
		st.push(5);
		st.push(2);
		st.push(3);
		Stack<Integer> temp_st = sortStack(st);
		while(!temp_st.isEmpty()) {
			System.out.println(temp_st.pop());
		}
	}
}
