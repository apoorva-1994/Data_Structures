package stack.programs;
import java.util.Stack;
public class RemoveOuterParenthesis {
	
	public static void removeOuterParenthesis(String s){
	      Stack<Character> st = new Stack<>();
	      StringBuilder sb = new StringBuilder();
	      char a = 's';
	      String mString = "";
	      for(int i = 0 ; i < s.length() ; i++) {
	    	  
	    	  if(s.charAt(i) == '(') {
	    		  st.push(s.charAt(i));
	    	  }
	    	  else if(s.charAt(i) == ')') {
	    		
	    		  if(st.isEmpty() == false && st.size()==2)
	    		  {
	    			  sb.append(st.pop()).append(s.charAt(i)); 
	    		  }else if(st.size() == 1) {
	    			  st.pop();
	    		  }
	    		  else {
					while(st.size()>1) {
						sb.append(st.pop());
					}
					sb.append(s.charAt(i));
				}
	    		  mString = sb.toString();
			     
	    	  } 	
	      }
	      System.out.println(mString);
	   }
	    
	    public static void main(String[] args) {
	       String s = "(()())(())(()(()))";
	       removeOuterParenthesis(s);
	    }

}
