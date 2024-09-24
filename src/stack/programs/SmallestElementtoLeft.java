package stack.programs;
import java.util.Stack;
public class SmallestElementtoLeft {
	
	public static void smallestElement(int arr[], int n) {	
		Stack<Integer> st = new Stack<>();
		for(int i = 0 ; i < n ; i++) {
			if(st.isEmpty()) {
				System.out.println("_");
			}else if(st.peek() < arr[i]) {
				System.out.println(st.peek());
			}else {
				while(st.isEmpty() == false && st.peek() > arr[i]) {
				st.pop();
			}
				System.out.println(st.peek());
		}
			st.push(arr[i]);
		}
	}
	
	public static void main(String[] args) {   
	   int arr[]  = {1, 6, 4, 10, 2, 5}; 
	   smallestElement(arr, arr.length);
	    
	}

}
