package stack.programs;
import java.util.Stack;
public class PalindromicLinkedList {
	
	public static boolean palindromeLL(int ar[]){
	      Stack<Integer> st = new Stack<>();
	      int ar2[] = new int[ar.length];
	      boolean isPalin = false;
	     for(int i = 0 ; i < ar.length ; i++) {
	    	 st.push(ar[i]);
	     }
	     int j = 0;
	     while(st.isEmpty() == false) {
	    	 int s = st.pop();
	    	 ar2[j] = s;
	    	 j++;
	     }
	     if(java.util.Arrays.equals(ar, ar2) == true) {
	    	 isPalin = true;
	    	 return isPalin;
	     }
	     return isPalin;
}
	    
	    public static void main(String[] args) {
	       int ar[] = {1,2};
	      System.out.print(palindromeLL(ar));
	    }
}
