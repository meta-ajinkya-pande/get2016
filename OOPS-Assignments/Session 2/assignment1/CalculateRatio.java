package assignment1;

import java.io.IOException;

public class CalculateRatio {
	private static int[] count;
	
	public void printRatio(String[][] ans){
		String[][] que = null;
		InputFile file = new InputFile();
		try {
			que = file.getQueStrings();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i=0;i<que.length;i++){
			if(que[i][1].equalsIgnoreCase("single select")){
				int c= que[i][2].split("/").length;
				count = new int[c];
				for(int j=0;j<ans.length;j++){
					int index = Integer.parseInt(ans[j][i]);
					count[index-1]++;
				}
			}
		}
		
		for(int i=0;i<count.length;i++){
			System.out.println((i+1)+": "+(count[i]*100/ans.length));
		}
	}
	
}
