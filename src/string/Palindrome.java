package string;

public class Palindrome {
	
	public void unctiation()
	{
		String ss= "totot";
		char ar[] = new char[ss.length()];
		String st = "";
		for(int i=ss.length()-1;i>=0;i--)
		{
			ar[i]= ss.charAt(i);
			st= st +ar[i];
			 
		}
		System.out.println(st);
		if(ss.equals(st))
		{ System.out.println("Palindrome");
		
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
	
	
	public static void main(String[] args)
	{
		Palindrome ar = new Palindrome();
		ar.unctiation();
		
	}

}
