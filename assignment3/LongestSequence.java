package assignment3;

public class LongestSequence {
	// This method is used to find out the longest sequence in array
	// start_loc tracks starting position
	// end_loc tracks ending position
	// diff tracks length of sequence
	public int[] longestSequence(int input[]){
		int[] start_loc = new int[30];
		int[] end_loc = new int[30];
		int[] diff = new int[30];
		int j=0;
		int input_len = input.length;
		start_loc[0] = 0;
		for(int in=0;in<input_len-1;in++){
			if(input[in]>input[in+1]){
				end_loc[j]=in;
				diff[j]= end_loc[j]-start_loc[j];
				start_loc[j+1]=in+1;
				j++;
			}
		}
		end_loc[j] = input_len-1;
		diff[j] = end_loc[j]-start_loc[j];
		
		int max_loc = 0;
		for(int i=1;i<=j;i++){
			if(diff[max_loc]<diff[i]){
				max_loc = i;
			}
		}
		int[] output =new int[diff[max_loc]+1];
		for(int i=0;i<=diff[max_loc];i++){
			output[i] = input[start_loc[max_loc]+i];
		}
		return output;
	}
	
}
