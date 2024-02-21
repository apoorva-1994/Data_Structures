package basic;

import string.DuplicateChars;

public class Prime {
	
	public void unctiation()
	{
		System.out.println("Enter the no");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int s= sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=s/2;i++)
		{
			if(s%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
			
		}
	}
	
	public static void main(String[] args)
	{
		Prime ar = new Prime();
		ar.unctiation();
	}


}
