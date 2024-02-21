package basic;

import string.DuplicateChars;

public class Palindrome {
	
	public void unctiation()
	{
		int a=353;
		int temp=a;
		int r=1,sum=0;
		while(a>0)
		{
			r= a%10;
			sum= (sum*10 )+ r;
			a= a/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		Palindrome ar = new Palindrome();
		ar.unctiation();
	}


}
