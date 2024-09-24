package stack.programs;

public class NextGreatestNumber {
	
	public static void nextGreatestEle(int ar1[], int ar2[]){
		int ar3[] = new int[ar1.length];
	      for(int i = 0 ; i < ar1.length ; i++) {
	    	  for(int j = 0 ; j < ar2.length ; j++) {
	    		  if(ar1[i] == ar2[j] && i != j) {
	    			  int m = ar2[j];
	    			  if(j == ar2.length - 1) {
	    					  ar3[i] = -1;
	    					  break;
	    				 }else if(ar2[j+1] > m) {
	    					  ar3[i] = ar2[j+1];
	    					  break;
	    				  } 
	    				  else {
	    					  ar3[i] = -1;
	    					  break;
	    				  }
	    		  }
	    	  }
	      }
	      for(int k = 0 ; k < ar3.length ; k++) {
	    	  System.out.print(ar3[k]);
	      }
  }
	    
	    public static void main(String[] args) {
	       int ar1[] = {2,4};
	       int ar2[] = {1,2,3,4};
	       nextGreatestEle(ar1,ar2);
	    }
}
