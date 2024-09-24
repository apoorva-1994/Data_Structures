package stack.programs;
import java.util.*;

public class ReverseIndividualWords {

	 public static void reverseWords(String str){
		Stack<Character> st = new Stack<Character>();
        if(str.length() > 0){
            for(int i = 0 ; i < str.length() ; i++){
          st.push(str.charAt(i));
      }
      while(!st.isEmpty()){
         char c = st.pop();
         System.out.print(c);
      }
        }else{
            System.out.println("empty string");
        }
      
	 }
    
    public static void main(String[] args) {
        
        String str = "Geeks for Geeks";
        reverseWords(str);
      
    }
}
	