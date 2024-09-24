package stack.programs;
import java.util.Queue;
import java.util.Stack;
public class StackUsingTwoQueues {
	
	static java.util.Queue<Integer> q1 = new java.util.LinkedList();
	static java.util.Queue<Integer> q2 = new java.util.LinkedList();
	public static void push(int a) {
		q2.add(a);
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
			
		}
		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
	}
	public static int pop() {
		if(q1.isEmpty()) {
			return -1;
		}
		return q1.remove(); 
	}
	public static int peek() {
		if(q1.isEmpty()) {
			return -1;
		}
		return q1.peek();	
	}
	
	public static void main(String[] args) {   
	      push(0);
	      push(1);
	      push(2);
	     System.out.println(pop()); 
	     System.out.println(peek());
	     System.out.println(q1.size());
	    
	  }
	

}
