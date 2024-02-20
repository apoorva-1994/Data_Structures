package string;

public class Rotation {
	
	public void unctiation()
	{
		String s1="abcde";
		String s2="deabc";
		if(s1.length()!=s2.length())
		{
			System.out.println("Not a rotation");
		}
		else {
			String s3=s1+s1;
			if(s3.contains(s2))
			{
				System.out.println("Rotation");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Rotation ar = new Rotation();
		ar.unctiation();
	}

}
