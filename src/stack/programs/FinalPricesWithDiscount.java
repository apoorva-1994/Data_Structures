package stack.programs;

public class FinalPricesWithDiscount {
	public static void finalPriceswithDiscount(int ar1[]){
		for(int i = 0 ; i < ar1.length ; i++) {
			for(int j = i+1 ; j < ar1.length ; j++) {
				if(ar1[i] > ar1[j]) {
					ar1[i] = ar1[i]-ar1[j];
					break;
				}
			}
		}
		for(int i = 0 ; i < ar1.length ; i++) {
			System.out.println(ar1[i]);
		}
  }
	    
	    public static void main(String[] args) {
	       int ar1[] = {10,1,1,6};
	       finalPriceswithDiscount(ar1);
	    }
}
