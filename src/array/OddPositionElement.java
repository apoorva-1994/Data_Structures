package array;

public class OddPositionElement {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,2,3,4,3};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(ar[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		OddPositionElement ar = new OddPositionElement();
		ar.unctiation();
	}

}
