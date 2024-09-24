package stack.programs;
import java.util.Stack;
public class BackspaceStringCompare {

	 public static void backspace(String ss , String tt){
	        Stack<Character> s1 = new Stack<Character>();
	        Stack<Character> s2 = new Stack<Character>();
	        
	        for(int i = 0 ; i < ss.length() ; i++){
	            if(ss.charAt(i)!='#'){
	                s1.push(ss.charAt(i));
	            }
	            s1.pop();
	        }
	        for(int i = 0 ; i < tt.length() ; i++){
	             if(tt.charAt(i)!='#'){
	                s2.push(tt.charAt(i));
	            }
	            s2.pop();
	        }
	        while(!s1.isEmpty() && !s2.isEmpty()){
	            s1.pop();
	            s2.pop();
	        }
	        if(s1.isEmpty() == true && s2.isEmpty() == true){
	            System.out.println("valid");
	        }else{
	            System.out.println("invalid");
	        }
	    }
	    
	    public static void main(String[] args) {
	        String ss = "ab#c";
	        String tt = "ad#c";
	        backspace(ss,tt);
	    }

}
