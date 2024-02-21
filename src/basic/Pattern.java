package basic;

import string.DuplicateChars;

public class Pattern {
	
	public void Pattern1()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
	
	public void Pattern2()
	{
		for(int i=1;i<5;i++)
		{
			for(int j = 2*(5-i); j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Pattern3()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=4-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void Pattern4()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args)
	{
		Pattern ar = new Pattern();
		ar.Pattern4();
	}


}
