package stack.programs;

import java.util.Stack;

public class Deleteconsecutivesamewords {
			
	public static Stack<String> deleteConsequetive(String s) {	
		Stack<String> st = new Stack<>();
		String ar[] = s.split("\\s");
		st.push(ar[0]);
		for(int i = 1 ; i < ar.length ; i++) {
			if(st.peek().equals(ar[i])) {
				st.pop();
				continue;
			}
			st.push(ar[i]);
		}
		return st;
	}
	
	public static void main(String[] args) {  
		String s = "tom jerry jerry tom";
		Stack<String> stack = deleteConsequetive(s);
		System.out.println(stack.size());
	}
}
