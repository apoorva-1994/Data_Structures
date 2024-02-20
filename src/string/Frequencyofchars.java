package string;

public class Frequencyofchars {
	
	public void unctiation()
	{
		String s1="ababeababeababeababe";
		char ar[]=s1.toCharArray();
		int freq[] =new int[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			freq[i]=1;
			
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					freq[i]++;
					ar[j]='0';
				}
			}
			
		}
		
		for(int i=0;i<s1.length();i++)
		{
			if(ar[i]!='0'&& ar[i]!=' ')
			{
				System.out.println(ar[i] + " " + freq[i] );
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		Frequencyofchars ar = new Frequencyofchars();
		ar.unctiation();
	}

}
