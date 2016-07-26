package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class SurveyReport {
	
	private static String[] options = null;
	private static String[] choices = null;
	public static void main(String ar[]) {
		String[][] ques = null;
		InputFile file = new InputFile();
		System.out.println("Enter The No. of Participants:");
		Scanner sc = new Scanner(System.in);
		// Getting the all questions in the ques array 
		try {
			ques = file.getQueStrings();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Here n denotes the no of participants
		int n = sc.nextInt();
		OutputFile file_out = new OutputFile(n, ques.length);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < ques.length; j++) {
				System.out.println(ques[j][0]);
				choices = new String[ques.length];
				if (!ques[j][1].equalsIgnoreCase("text")) {
					options = ques[j][2].split("/");
					for (int k = 0; k < options.length; k++) {
						System.out.println("  " + (k + 1) + " : " + options[k]);
					}
					if (ques[j][1].equalsIgnoreCase("Single Select")) {
						System.out.println("Select Only One Choice");
						int choice = sc.nextInt();
						while (choice > options.length) {
							System.out
									.println("Please Fill The Correct Choice");
							choice = sc.nextInt();
						}
						choices[j] = options[choice - 1];
					} else if (ques[j][1].equalsIgnoreCase("Multi Select")) {
						System.out
								.println("Select Multiple Choice and give 0 for break");
						int ctemp, l = 0;
						while (l <= options.length && (ctemp = sc.nextInt()) != 0) {
							while (ctemp > options.length) {
								System.out
										.println("Please Fill The Correct Choice");
								ctemp = sc.nextInt();
							}
							if (choices[j] == null) {
								choices[j] = options[ctemp - 1];
							} else {
								choices[j] += "/" + options[ctemp - 1];
							}
						}
					}
				}
				else {
					sc.nextLine();
					choices[j] = sc.nextLine();
				}
				file_out.storeOutput(choices, i, j);
			}
		}
		sc.close();
		file_out.printOutput();
	}
	
}
