package assignment2;

public class RemoveDuplicates {

	// This function is used to check that elements is present over resultant array  
	public boolean checkResultant(String resultant,int value){
		int counter = 0;
		char[] ar = resultant.toCharArray();
		for (char ch : ar) {
			int temp = Integer.parseInt(ch+"");
			if(temp == value){
				counter = 1;
				break;
			}
		}
		if(counter == 1)
			return false;
		else 
			return true;
	}
	
	// it remove duplicates elements
	public int[] removeDuplicate(int input[]) {
		// TODO Auto-generated method stub
		String resultant ="";
		for(int in : input){
			if(checkResultant(resultant,in)){
				resultant = resultant+in;
			}
		}
		char[] temp = resultant.toCharArray();
		int len = resultant.length();
		int [] output = new int[len];
		for(int i=0;i<len ;i++){
			output[i] = Integer.parseInt(temp[i]+"");
		}
		return output;
		
	}

}
