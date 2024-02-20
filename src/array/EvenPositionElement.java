package array;

public class EvenPositionElement {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,2,3,4,3};
		for(int i = 0;i<ar.length;i++)
		{
			if(i % 2==0)
			{
				System.out.println(ar[i+1]);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		EvenPositionElement ar = new EvenPositionElement();
		ar.unctiation();
	}

}
