package assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Operations {
	public static void main(String ar[]) throws IOException{
		
		List<Question> questions = new ArrayList<Question>();
		String[][] que = new Question().getQueStrings();
		for(int i=0;i<que.length;i++){
			Question question1 = new Question();
			question1.setQuetext(que[i][0]);
			questions.add(question1);
		}
		 Collections.sort(questions);
		 for(Question temp : questions){
				System.out.println(temp.getQuetext());	
			}

	}
	
}
