package stack.programs;
import java.util.Stack;
public class MaxNestedDepth {

	public static void maxDepth(String s){
	       Stack<Character> st = new Stack<>();
	       int k = 0; int max = 0;
	       for(int i = 0 ; i < s.length() ; i++){
	           if(s.charAt(i) == '('){
	               st.push(s.charAt(i));
	               k++;
	           }else {
	        	   if(st.isEmpty() == true) {
	        		   continue;
	        	   }
	        	   else if(st.peek() == '(' && s.charAt(i) == ')'){
		                   st.pop();  
		                   k--;
		               }else {
		            	   continue;
		               }
	           }
	           if(k > max) {
	        	   max = k;
	           }
	          
	       }
	       System.out.println(max);
	    }
	    
	    public static void main(String[] args) {
	       String s = "(1+(2*3)+((8)/4))+1";
	       maxDepth(s);
	    }

}
