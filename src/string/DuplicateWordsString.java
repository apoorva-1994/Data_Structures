package string;

public class DuplicateWordsString {
	
	public void unctiation()
	{
		
		String ss= "big black bug bit a big black dog on his big black nose";
		String dd[] = ss.split(" ");
		for(int i=0;i<dd.length;i++)
		{
			int count=1;
			for(int j=i+1;j<dd.length;j++)
			{
				if(dd[i].equals(dd[j]))
				{
					count++;
					dd[j]=" ";
				}
			}
			if(count>1 && dd[i]!= " ")
			{
				System.out.println("Duplicate words are : "+dd[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		DuplicateWordsString ar = new DuplicateWordsString();
		ar.unctiation();
		
	}


}
