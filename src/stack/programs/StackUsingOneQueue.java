package stack.programs;

public class StackUsingOneQueue {
	static java.util.Queue<Integer> q = new java.util.LinkedList();
	public static void push(int a) {
		int size = q.size();
		q.add(a);
		for(int i = 0 ; i < size ; i++) {
			int m = q.remove();
			q.add(m);
		}
	}
	public static int pop() {
		return q.remove(); 
	}
	public static int peek() {
		return q.peek();	
	}
	
	public static void main(String[] args) {   
	      System.out.println("-----------");
	      push(0);
	      push(1);
	      push(2);
	      pop();
	      peek();
	  }
}
