package string;

public class StringReverse {
	
	public void reverseString()
	{
		String ssString = "apoorva is a good girl";
		char ar[]= ssString.toCharArray();
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]);
		}
	}
	
	public void reverseword()
	{
		String ssString = "apoorva is a good girl";
		String ss[] = ssString.split(" ");
	
		for(String s : ss)
		{
			System.out.print(" ");
			char ar[]= s.toCharArray();
			for(int i=ar.length-1;i>=0;i--)
			{
				
				System.out.print(ar[i]);
			}
			
		}
	}
	
	public void builder()
	{
		String ssString = "apoorva";
		StringBuilder sb= new StringBuilder(ssString);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args)
	{
		StringReverse sr = new StringReverse();
	//	sr.reverseString();
		sr.builder();
	//	sr.reverseword();
	}

}
