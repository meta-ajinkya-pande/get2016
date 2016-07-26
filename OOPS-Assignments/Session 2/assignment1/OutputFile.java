package assignment1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {
	static private String[][] participants_ans;

	OutputFile(int no_participants, int no_ques) {
		participants_ans = new String[no_participants][no_ques];
	}

	public void printOutput() {
		try {
			BufferedWriter out = new BufferedWriter(
					new FileWriter(
							"C:\\metacube workspace\\Answer.txt"));

			for (int i = 0; i < participants_ans.length; i++) {
				out.write("Participant" + (i + 1));
				for (int j = 0; j < participants_ans[i].length; j++) {
					out.write(",");
					out.write(participants_ans[i][j]);
				}
				out.newLine();
			}
			out.close();
			new CalculateRatio().printRatio(participants_ans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void storeOutput(String[] ans, int pariticipant_no, int ques_no) {
		participants_ans[pariticipant_no][ques_no] = ans[ques_no];
	}
}
