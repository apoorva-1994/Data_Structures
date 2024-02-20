package array;

public class Reverse {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,2,3,4,3};
		for(int i=ar.length-1;i>=0;i--)
		{
			
				System.out.print(ar[i]);
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Reverse ar = new Reverse();
		ar.unctiation();
	}
	

}
