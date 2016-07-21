package assignment1;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
	static int i=0;
	/*
	 * This Part of function solve the tower of hanoi problem.
	 * The array[i][0] indicates from_location.
	 * The array[i][1] indicates to_location.
	 * that is array[i][0]=>array[i][1] indicates like A=>B or B=>C
	 */
	
	public List<String> toi(int n , char start , char temp , char end, List<String> array){
		if(n==1){
			array.add("Move Disk "+n+" from "+start+" to "+end);
			return array;
		}
		else {
			toi(n-1,start,end,temp,array);
			array.add("Move Disk "+n+" from "+start+" to "+end);
			toi(n-1,temp,start,end,array);
			return array;
		}
	}
	
	// This function is only used to initialize inputs and return output
	public List<String> tower(int n){
		List<String> output = new ArrayList<String>();
		toi(n,'A','B','C',output);
		for (String string : output) {
			System.out.println(string);
		}
		return output;
	}
	
	public static void main(String []ar){
		new TowerOfHanoi().tower(2);
		
	}
}
