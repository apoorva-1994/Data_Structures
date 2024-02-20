package string;

public class Replace_lowerupper {
	
	
	public void unctiation()
	{
		String ss="aBcD";
		for(int i=0;i<ss.length();i++)
		{
			int ax=ss.charAt(i);
			char a=ss.charAt(i);
			if(ss.charAt(i)>=97 && ss.charAt(i)<=122)
			{
				
				a = (char) (ax-32);
				System.out.print(a);
				
			}
			else {
				
				a = (char) (ax+32);
				System.out.print(a);
			}
		}
	
		
	}
	
	public static void main(String[] args)
	{
		Replace_lowerupper ar = new Replace_lowerupper();
		ar.unctiation();
	}

}
