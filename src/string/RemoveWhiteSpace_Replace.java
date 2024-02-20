package string;

public class RemoveWhiteSpace_Replace {
	
	public void unctiation()
	{
		String ss= "iceman fdf!@# is the good girl";
		
		ss = ss.replace(' ', 'a');
		
		System.out.println(ss);
		
		
	}
	
	
	public static void main(String[] args)
	{
		RemoveWhiteSpace_Replace ar = new RemoveWhiteSpace_Replace();
		ar.unctiation();
	}

}
