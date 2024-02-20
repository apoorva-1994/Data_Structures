package string;

import java.util.Iterator;

public class Anagram {
	
	public void anagram()
	{
		String ss= "iceman";
		String tt = "dfg";
		char ar1[] = new char[ss.length()];
		char ar2[] = new char[tt.length()];
		java.util.Arrays.sort(ar1);
		java.util.Arrays.sort(ar2);
		for(int i=0;i<ss.length();i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println("Not a anagram");
			}
		}
	
		/*if(ss.length()==tt.length())
		{
			
			for(int i=0;i<ss.length();i++)
			{
				for(int j=0;j<tt.length();j++)
				{
					if(ss.charAt(i)==tt.charAt(j))
					{
						System.out.println("char for ss :"+ss.charAt(i)+" char for tt "+tt.charAt(j));
					}
//					else {
//						System.out.println("No chars matching");
//						//sbreak;
//					}
				}
			}
		}
		else {
			System.out.println("Not a anagram");
		}*/
		
	}
	
	public static void main(String[] args)
	{
		Anagram ar = new Anagram();
		ar.anagram();
	}

}
