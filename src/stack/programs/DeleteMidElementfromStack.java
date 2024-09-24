package stack.programs;

import stack.implementation.Stack;

public class DeleteMidElementfromStack {
	
	public static void deleteMid(Stack st, int size) {
		if(st.size() > 0) {
			int index = size/2; 
			  Stack st2 = new Stack();
			  int i = 0;
			  while(!st.isEmpty()) {
				  if(i == index) {
					  int mid = st.pop();
					  System.out.println(mid);
					  break;
				  }
				  st2.push(st.pop());
				  i++;
			  }
			 while(!st2.isEmpty()) {
				 st.push(st2.pop());
			 }
			 while(!st.isEmpty()) {
				 System.out.println(st.pop());
			 }
		}else {
			 System.out.println("Stack is empty");
		}
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(0);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		int m = st.size();
		deleteMid(st,m);
	}

}
