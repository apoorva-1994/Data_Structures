package array;

public class Smallest {
	
	
	public void unctiation()
	{
		int ar[] = {11,2,3,4,1,13,4,3};
		int small=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		
		System.out.println(small);
	}
	
	public static void main(String[] args)
	{
		Smallest ar = new Smallest();
		ar.unctiation();
		
	}

}
