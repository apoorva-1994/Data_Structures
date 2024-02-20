package array;

public class SumofElements {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,5,3,4,3};
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum = sum + ar[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		SumofElements ar = new SumofElements();
		ar.unctiation();
	}

}
