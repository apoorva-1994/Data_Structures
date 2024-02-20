package string;

public class SeperateChars {
	
	public void anagram()
	{
		String ss= "iceman";
		for(int i=0;i<ss.length();i++)
		{
			System.out.println(ss.charAt(i));
		}
		
		
	}
	
	public static void main(String[] args)
	{
		SeperateChars ar = new SeperateChars();
		ar.anagram();
	}

}
