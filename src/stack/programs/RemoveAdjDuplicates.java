package stack.programs;
import java.util.Stack;
public class RemoveAdjDuplicates {
	
	public static void removeAdjDup(String s){
	      Stack<Character> st = new Stack<>();
	      st.push(s.charAt(0));
	      StringBuilder sb = new StringBuilder();
	      for(int i = 1 ; i < s.length() ;  i++) {
	    	 if(st.isEmpty()==false &&  st.peek() == s.charAt(i)) {
	    		 st.pop();
	    	 }
	    	 else {
				st.push(s.charAt(i));
			}
	      }
	      while(st.isEmpty() == false) {
	    	  sb.append(st.pop());
	      }
	      System.out.println(sb.reverse().toString());
	      
}
	    
	    public static void main(String[] args) {
	       String s = "azxxzy";
	       removeAdjDup(s);
	    }

}
