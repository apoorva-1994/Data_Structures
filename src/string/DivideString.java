package string;

import java.util.Iterator;

public class DivideString {
	
	public void unctiation()
	{
		String ss= "iceman";
		int i=2;
		int chars=ss.length()/i;
		String ss2[] = new String[i];
		int so=0;
		for(int k=0;k<ss.length();k=k+chars)
		{
			String pp = ss.substring(k,k+chars);
			ss2[so]=pp;
			so++;
		}
	 for(int j=0; j<ss2.length;j++)
	 {
		 System.out.println(ss2[j]);
	 }
		
	}
	
	public static void main(String[] args)
	{
		DivideString ar = new DivideString();
		ar.unctiation();
	}

}
