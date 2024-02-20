package string;

import java.util.Arrays;

public class SmallBigPalindrome {
	
	public void anagram()
	{
		String small,big;
		String ss= "Wow you own kayak";
		java.util.ArrayList<String> as= new java.util.ArrayList<String>();
		String[] ar=ss.toLowerCase().split("\\s+");
	
		for(String s: ar)
		{
		//	System.out.println(s);
			String rev="";
			char ch[]= s.toCharArray();
			for(int i=s.length()-1;i>=0;i--)
			{
				rev = rev + ch[i];
			}
			if(s.equals(rev))
			{
				as.add(s);
			}
		}
		
		small=big=as.get(0);
		
		for(int i=0;i<as.size();i++)
		{
			if(small.length()>as.get(i).length())
			{
				small=as.get(i);
			}
			
			if(big.length()<as.get(i).length())
			{
				big=as.get(i);
			}
		}
		
		System.out.println(small);
		System.out.println(big);
	}
	
	
	public static void main(String[] args)
	{
		SmallBigPalindrome ar = new SmallBigPalindrome();
		ar.anagram();
	}

}
