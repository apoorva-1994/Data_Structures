package string;

public class SwapString {
	
	public void unctiation()
	{
		String ss1= "totot";
		String ss2= "hjghj";
	//	totothjghj
		ss1 = ss1 + ss2;
		
		ss2= ss1.substring(0, (ss1.length()-ss2.length()));
		ss1 = ss1.substring(ss2.length());
		System.out.println(ss1 +" "+ss2);
	}
	
	public static void main(String[] args)
	{
		SwapString sr = new SwapString();
		sr.unctiation();
	}

}
