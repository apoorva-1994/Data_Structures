package basic;

import string.DuplicateChars;

public class Fibonanci {
	
	public void unctiation()
	{
		System.out.println("Enter the no");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int s= sc.nextInt();
		int b=s%2;
		int c=s/2;
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Fibonanci ar = new Fibonanci();
		ar.unctiation();
	}

	

}
