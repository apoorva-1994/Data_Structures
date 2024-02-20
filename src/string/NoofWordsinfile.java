package string;

import java.io.IOException;

public class NoofWordsinfile {
	
	public void anagram() throws IOException
	{
		String line;
		int count=0;
		java.util.ArrayList<String> ar1 = new java.util.ArrayList<String>();
		java.io.FileReader fr= new java.io.FileReader("/home/apoo/code/java/JavaPrograms/hunh.txt");
		java.io.BufferedReader br= new java.io.BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			String ar[] = line.split("\\s+");
			count=count+ar.length;
			
		}
		System.out.println("Length is:"+count);
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		NoofWordsinfile ar = new NoofWordsinfile();
		ar.anagram();
	}

}
