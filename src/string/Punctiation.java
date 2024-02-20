package string;

public class Punctiation {
	
	public void unctiation()
	{
		String ss= "iceman fdf!@#";
		int count=0;
		for(int i=0;i<ss.length();i++)
		{
			if (ss.charAt(i)=='!'|| ss.charAt(i)=='@'|| ss.charAt(i)=='#') {
				
				count++;
				
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		Punctiation ar = new Punctiation();
		ar.unctiation();
	}

}
