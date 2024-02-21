package basic;

import string.DuplicateChars;

public class Factorial {
	
	public void unctiation()
	{
		System.out.println("Enter the no");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int s= sc.nextInt();
		int fact=1;
		for(int i=s;i>0;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	
	
	public static void main(String[] args)
	{
		Factorial ar = new Factorial();
		ar.unctiation();
	}


}
