package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question implements Comparable<Question> {
	private String questionString = null;
	
	
	public String getQuetext() {
		return questionString;
	}
	
	public void setQuetext(String quetext) {
		this.questionString = quetext;
	}

	@Override
	public int compareTo(Question o) {
		 // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than 
        // other and 0 if they are supposed to be equal
        int last = this.questionString.compareTo(o.questionString);
        return last == 0 ? this.questionString.compareTo(o.questionString) : last;
	}
	
	public String[][] getQueStrings() throws IOException{
		BufferedReader in = null;
		String[][] ques = null;
		int counter =0;
		try{
			in = new BufferedReader(new FileReader("Question.txt"));
			String c;
			int i=0;
	        while (in.readLine() != null) {
	        	counter++;
	        }
	        in.close();
	        in = new BufferedReader(new FileReader("Question.txt"));
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
