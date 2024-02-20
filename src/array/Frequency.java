package array;

public class Frequency {
	
	public void unctiation()
	{
		int ar[] = {1,2,3,4,5,3,4,3};
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<ar.length;j++)
			{
				 if(ar[i]==ar[j])
				 {
					 count++;
					 ar[j]=0;
				 }
		    }
			if(ar[i]!=0)
			{
				System.out.println(ar[i] + " has occured "+count);
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		Frequency ar = new Frequency();
		ar.unctiation();
		
	}

}
