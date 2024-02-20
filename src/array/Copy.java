package array;

import string.DuplicateWordsString;

public class Copy {
	
	public void unctiation()
	{
		
		int ar[] = {1,2,3,4,5};
		String ss = "apoorva";
		int s[] = new int[ar.length];
		
		for(int i=0;i<ar.length;i++)
		{
			s[i]=ar[i];
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Copy ar = new Copy();
		ar.unctiation();
		
	}

}
