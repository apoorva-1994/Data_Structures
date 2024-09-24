package stack.programs;
import java.util.Stack;
public class ReversePrefixofWord {

	public static String reversePrefix(String s,char a){
        int n = s.indexOf(a);
        String h = "";
        if(n == -1){
        }else{
            System.out.println(n);
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <= n ; i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
             sb.append(st.pop());
        }
      String m = sb.toString();
       h = m.concat(s.substring(4,s.length()));
       return h ;
    }
        return h;
    }
    public static void main(String[] args) {
        String s = "xyxzxe";
        char a = 'z';
        reversePrefix(s,a);
    }

}
