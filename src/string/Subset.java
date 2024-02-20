package string;

public class Subset {
	
	public void unctiation()
	{
		String ss= "ice";
		int len=ss.length();
		String a[] = new String[len*(len+1)/2];
		int temp=0;
		for(int i=0;i<ss.length();i++)
		{
			for(int j=i;j<ss.length();j++)
			{
				String pp= ss.substring(i, j+1);
				System.out.println(pp);
				a[temp]=pp;	
				temp++;	
			}
			
		}
		
	}
	
	public static void main(String[] args)
	{
		Subset ar = new Subset();
		ar.unctiation();
	}

}
