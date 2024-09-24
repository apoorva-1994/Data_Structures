package stack.programs;

import java.util.Stack;

public class ClearDigits {

	public static void clearDigits(String ss){
		Stack<Character> stack = new Stack<>();
		StringBuilder sBuilder = new StringBuilder();
		String s = "";
		for(char a : ss.toCharArray()) {
			 if(a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9') {
				 stack.pop();
			 }else {
				stack.push(a);
			}
		}
		while(stack.isEmpty()==false) {
			sBuilder = sBuilder.append(stack.pop());
		}
		System.out.println(sBuilder.reverse().toString());
    }
    
    public static void main(String[] args) {
        String ss = "cb34";
        clearDigits(ss);
    }

}
