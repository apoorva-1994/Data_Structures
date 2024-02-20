package array;

public class Duplicate {
	
	public void unctiation()
	{
		
		int ar[] = {1,2,3,4,2,3,4,3};
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
			if(count>1&&ar[i]!=0)
			{
				System.out.println(ar[i]);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Duplicate ar = new Duplicate();
		ar.unctiation();
		
	}


}
