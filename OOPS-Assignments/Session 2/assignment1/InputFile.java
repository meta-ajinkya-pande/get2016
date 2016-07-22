package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	public String[][] getQueStrings() throws IOException{
		BufferedReader in = null;
		String[][] ques = null;
		int counter =0;
		try{
			in = new BufferedReader(new FileReader("E:\\ajinkya workspace\\OOPS Session2\\src\\assignment1\\Question.txt"));
			String c;
			int i=0;
	        while (in.readLine() != null) {
	        	counter++;
	        }
	        in.close();
	        in = new BufferedReader(new FileReader("E:\\ajinkya workspace\\OOPS Session2\\src\\assignment1\\Question.txt"));
	        ques = new String[counter][];
	        while((c= in.readLine())!=null){
	        	ques[i++] = c.split(",");
	        }
	        in.close();
		}catch(Exception e)	{
			System.out.println(e);
		}
		return ques;
	}
	
}
