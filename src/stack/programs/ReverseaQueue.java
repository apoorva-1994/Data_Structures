package stack.programs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseaQueue {
	
	public static void reverseQueue(Queue<Integer> q) {
		Stack<Integer> st = new Stack<>();
		while(q.isEmpty()==false) {
			st.push(q.remove());
		}
		while(!st.isEmpty()) {
			q.add(st.pop());
		}
		while(q.isEmpty() == false) {
			System.out.println(q.remove());
		}
	}
	public static void main(String[] args) {  
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		reverseQueue(q);
	}

}
