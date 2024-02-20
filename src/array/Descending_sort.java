package array;

public class Descending_sort {
	
	public void unctiation()
	{
		int ar[] = {11,2,3,4,1,13,4,3};
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Descending_sort ar = new Descending_sort();
		ar.unctiation();
		
	}

}
