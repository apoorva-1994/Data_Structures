package array;

public class SmallestElement {
	
	public void unctiation()
	{
		int ar[] = {11,2,3,4,1,13,4,3};
		int small;
		small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println("Small is:"+small);
		
	}
	
	public static void main(String[] args)
	{
		SmallestElement ar = new SmallestElement();
		ar.unctiation();
	}

}
