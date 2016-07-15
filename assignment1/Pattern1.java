package assignment1;

public class Pattern1 {
	/*
	 * The Whole concept was divided into 3 parts:
	 * 1:Spaces to print
	 * 2:Numbers to Print
	 * 3:Draw a whole pattern with help of combination of spaces and numbers
	 * 
	 */
	// n is the max value of the pattern
	// This method is used to define no of spaces for every row.
	public String spaces(int row,int n){
		String space = "";
		for(int i=0;i<(n-row);i++){
			space += " ";
		}
		if(row>n){
			for(int i=n;i<row;i++){
				space +=" ";
			}
		}
		return space;
	}
	
	//This method is used to define how much no is to print 
	public String numbers(int row,int n){
		String number = "";
		int counter = 0;
		if(row<=n){
			for(int i=0;i<(2*row-1);i++){
				if(i<row){
					counter++;
					number += counter;
				}
				else{
					counter--;
					number += counter;
				}
			}
		}
		else if(row>n){
			for(int i=0;i<(2*(n-(row-n))-1);i++){
				if(i<n-(row-n)){
					counter++;
					number += counter;
				}
				else{
					counter--;
					number += counter;
				}
			}
		}
		return number;
	}
	// This Method is used to draw pattern required
	public String[] drawPattern(int n){
		String[] output = new String[2*n-1];
		String number,space;
		for(int i=0;i<2*n-1;i++){
			number = numbers(i+1,n);
			space = spaces(i+1,n);
			output[i] = space+number;
		}
		return output;
	}

}
