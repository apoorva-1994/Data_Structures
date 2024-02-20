package string;

import java.io.IOException;

public class MostRepeatedword {
	
	public void anagram() throws IOException
	{
		String line,word="";
		int count,maxct=0;
		java.util.ArrayList<String> ar= new java.util.ArrayList<String>();
		
		java.io.FileReader fr= new java.io.FileReader("/home/apoo/code/java/JavaPrograms/hunh.txt");
		java.io.BufferedReader br= new java.io.BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			 String[] ss= line.toLowerCase().split("\\s+");
			 for(String s: ss) {
				// System.out.println(s);
				 ar.add(s);
			 }
		}
		
		for(int i=0;i<ar.size();i++)
		{
			count=1;
			for(int j=i+1;j<ar.size();j++)
			{
				if(ar.get(i).equals(ar.get(j)))
				{
					count++;
				}
			}
			
			if(count>maxct)
			{
				maxct=count;
				word=ar.get(i);
			}
		}
		System.out.println("Most reapeated word is:"+word);
		br.close();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		MostRepeatedword ar = new MostRepeatedword();
		ar.anagram();
	}

}
