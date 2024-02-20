package array;

public class RightRotate {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,5,3,4,3};
		int last=ar[ar.length-1];
		for(int i =ar.length-1; i>=0;i--)
		{
			if(i==0)
			{
				ar[i]=last;
			}
			else {
				ar[i]=ar[i-1];
			}
		//	System.out.print(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
	}
	
	public static void main(String[] args)
	{
		RightRotate ar = new RightRotate();
		ar.unctiation();
		
	}

}
