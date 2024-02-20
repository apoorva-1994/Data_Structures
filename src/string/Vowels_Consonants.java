package string;

public class Vowels_Consonants {
	
	public void unctiation()
	{
		String ss= "iceman";
		int vo=0;
		int cons=0;
		
		for(int i=0;i<ss.length();i++)
		{
			if(ss.charAt(i)=='a'|| ss.charAt(i)=='e'|| ss.charAt(i)=='i'|| ss.charAt(i)=='o'||ss.charAt(i)=='u')
			{
				vo++;
			}
			else {
				{
					cons++;
				}
			}
		}
		System.out.println("Vowels are "+vo);
		System.out.println("Consonants are :"+cons);
	}
	
	public static void main(String[] args)
	{
		Vowels_Consonants ar = new Vowels_Consonants();
		ar.unctiation();
	}

}
