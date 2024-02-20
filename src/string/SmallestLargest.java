package string;

public class SmallestLargest {
	
	public void anagram()
	{
		 String small, large;
		 String string="Hardships often prepare ordinary people for an extraordinary destiny";
		 
		 String ar[]= string.toLowerCase().split(" ");
		 
		 small=large=ar[0];
		
		 	for(int i=0;i<ar.length;i++)
		 	{
		 		if(small.length()>ar[i].length())
		 		{
		 			small=ar[i];
		 		}
		 		if(large.length()<ar[i].length())
		 		{
		 			large=ar[i];
		 		}
		 	}
		 System.out.println(small);
		 System.out.println(large);
	}
	
	public static void main(String[] args)
	{
		SmallestLargest sr = new SmallestLargest();
		sr.anagram();
	}

}
