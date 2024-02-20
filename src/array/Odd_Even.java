package array;

public class Odd_Even {
	public void unctiation()
	{
		int ar[] = {11,2,3,4,1,13,4,3};
		int even_ct=0;
		int odd_ct=0;
		int j=0;int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even_ct++;	
			}
			
			else {
				odd_ct++;	
			}
		}
		int even[]= new int[even_ct];
		int odd[]= new int[odd_ct];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even[j]=ar[i];
				j++;
			}
			else {
				odd[k]=ar[i];
				k++;
			}
		}
		
		for(int l=0;l<even.length;l++)
		{
			System.out.println("Even no is : "+even[l]);
		}
		for(int m=0;m<odd.length;m++)
		{
			System.out.println("Odd no is : "+odd[m]);
		}
	}
	
	public static void main(String[] args)
	{
		Odd_Even ar = new Odd_Even();
		ar.unctiation();
		
	}

}
