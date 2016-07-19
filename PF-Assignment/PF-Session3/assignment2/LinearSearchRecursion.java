package assignment2;

public class LinearSearchRecursion {
	// In this the logic is to search in increasing order of the index up to last elements it checks. 
	public int linearSearch(int index,int target,int[] ar){
		if(index >= ar.length){
			return 0;
		}
		if(ar[index]==target){
			return 1;
		}
		else {
			return linearSearch(index+1, target,ar);
		}
	}
}
