package assignment2;

public class Pattern2 {
	/*
	 * The Whole concept was divided into 3 parts:
	 * 1:Spaces to print
	 * 2:Numbers to Print
	 * 3:Draw a whole pattern with help of combination of spaces and numbers
	 * 
	 */
	//This method is used to define no of spaces for every row.
	public String spaces(int row){
		String space="";
		for(int i=0;i<row;i++){
			space += " ";
		}
		return space;
	}
	
	//This method is used to define how much no is to print 
	public String numbers(int row,int n){
		String number="";
		int counter = 1;
		for(int i=0;i<n-row;i++){
			number += counter;
			counter++;
		}
		return number;
	}
	
	// This Method is used to draw pattern required
	public String[] drawPattern(int n){
		String[] output = new String[n];
		String number,space;
		for(int i=0;i<n;i++){
			number = numbers(i,n);
			space = spaces(i);
			output[i] = space+number;
		}
		return output;
	}
	
}
