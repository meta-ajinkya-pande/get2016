package assignment5;

public class ArraySorted {
	// It check whether the array is ascending, descending or unsorted 
	public int isSorted(int[] input){
		int assend_count=1,deccen_count=1;
		int len = input.length;
		for(int i=0;i<len-1;i++){
			if(input[i]<input[i+1]){
				assend_count++;
			}
			else if(input[i]>input[i+1]){
				deccen_count++;
			}
		}
		if(assend_count == len){
			return 1;
		}
		else if(deccen_count == len){
			return 2;
		}
		return 0;
	}
}
