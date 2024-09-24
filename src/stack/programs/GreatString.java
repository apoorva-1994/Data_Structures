package stack.programs;
import java.util.Stack;
public class GreatString {
	
	public static void greatString(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String j = "";
        st.push(s.charAt(0));
        for(int i = 0 ; i < s.length() ; i++){
            if(st.peek() == s.charAt(i) || st.peek() == s.charAt(i) + 32 || st.peek() == s.charAt(i) - 32){
                 st.pop();
                 continue;
            }else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        j = sb.reverse().toString();
        System.out.println(j);
    }
    
    public static void main(String[] args) {
       String s = "leEeetcode";
       greatString(s);
    }

}
