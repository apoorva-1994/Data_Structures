package array;

public class Remove_Duplicate {
	
	public void unctiation()
	{
		int ar[] = {11,2,3,4,1,13,4,3};
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					ar[j]=0;
				}
			}
			
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				System.out.println(ar[i]);
			}
		}
		
//		System.out.println("Dup are "+count);
//		int dup[]=new int[ar.length-count+1];
//		int k=0;
//		for(int i=0;i<ar.length;i++)
//		{
//			for(int j=i+1;j<ar.length;j++)
//			{
//				if(ar[i]!=ar[j])
//				{
//					dup[k]=ar[i];
//						k++;	
//				}
//			}
//		}
//		for(int i=0;i<dup.length;i++)
//		{
//			System.out.println(dup[i]);
//		}
//
//		
		
	}
	
	public static void main(String[] args)
	{
		Remove_Duplicate ar = new Remove_Duplicate();
		ar.unctiation();
		
	}

}
