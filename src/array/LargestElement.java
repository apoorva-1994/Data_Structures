package array;

public class LargestElement {

	public void unctiation()
	{
		int ar[] = {1,2,3,4,5,13,4,3};
		int large;
		large=ar[0];
		for(int i=0;i<ar.length;i++)
		{
				if(ar[i]>large)
					
				{
					large=ar[i];
				}
					
		}
		
		System.out.println("large:"+large);
	}
	
	public static void main(String[] args)
	{
		LargestElement ar = new LargestElement();
		ar.unctiation();
	}
}
