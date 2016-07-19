package assignment6;

public class JoinArray {
	//This method is used to join two sorted arrays 
	public int[] joinTwoArray(int[]ar1,int[]ar2){
		int len1 = ar1.length;//  Length of an Array1 
		int len2 = ar2.length;//  Length of an Array2
		int[] output = new int[len1+len2];
		int ar1_counter=0,ar2_counter=0;
		for(int i=0;i<(len1+len2);i++){
			if(ar1_counter<len1 && ar2_counter<len2){
				if(ar1[ar1_counter]<ar2[ar2_counter]){
					output[i] = ar1[ar1_counter++];
				}
				else if(ar1[ar1_counter]>ar2[ar2_counter]){
					output[i] = ar2[ar2_counter++];
				}
			}
			else if(ar2_counter < len2){
				output[i] = ar2[ar2_counter++];
			}
			else if(ar1_counter < len1){
				output[i] = ar1[ar1_counter++];
			}
		}
		return output;
	}
	
}
