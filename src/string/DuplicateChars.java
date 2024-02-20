package string;

public class DuplicateChars {
	
	public void unctiation()
	{
		String s1="ababe";
		int count;
		char ar[]= new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				
			}
			if(count>1)
			{
				ar[i]=s1.charAt(i);
				
			}
		}
		System.out.println(ar);
	}
	
	
	public static void main(String[] args)
	{
		DuplicateChars ar = new DuplicateChars();
		ar.unctiation();
	}

}
