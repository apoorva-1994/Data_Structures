package array;

public class LeftRotate {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,5,3,4,3};
		int first = ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(i==ar.length-1)
			{
				ar[i]=first;
			}
			else {
				ar[i]=ar[i+1];
			}
			System.out.print(ar[i]);
		}
		
	}
	
	public static void main(String[] args)
	{
		LeftRotate ar = new LeftRotate();
		ar.unctiation();
		
	}

}
