package assignment2;


public class NQueenProblem {
	/*this method helps to solve the queens problem and return the desired output.
	  we initially took quuens value to 40 to solve and then revert it back to 1*/
	int[][] queensProblem(int[][]result, int row, int column, int totalRows, int totalColumns){
		
		int flag = 0, count2=0;
		int columnValue=0;
		
		for(int rowIndex=0 ; rowIndex<totalColumns ; rowIndex++){	//this loop checks for queen at given row and make it zero while backtracking
			if(result[row][rowIndex] == 40){
				result[row][rowIndex] = 0;
			}
			else{							//this loop checks for queen at other column
				boolean check=true;
				for(int columnIndex=rowIndex+1 ; columnIndex<totalColumns ; columnIndex++){
					if(result[row][columnIndex] == 40){
						check=false;
					}
				}
				if(result[row][rowIndex] == 0 && check){		//if no queen is found then it assigns a queen	
					result[row][rowIndex] = 40;
					columnValue = rowIndex;
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0){				//this gets executed when there is no queen in the row. For backtracking
		
			int count1 = 0;
			for(int rowIndex=0 ; rowIndex<totalRows ; rowIndex++){	//this reverts the changes made by previous queen
				
				for(int columnIndex=0 ; columnIndex<totalColumns ;columnIndex++){
					
					if(result[rowIndex][columnIndex] == row){
						
						result[rowIndex][columnIndex] = 0;
					}
				}
			}
			
			for(int rowIndex=0 ; rowIndex<totalRows ; rowIndex++){			//it counts for the number of queens
				for(int columnIndex=0 ; columnIndex<totalColumns ; columnIndex++){
					if(result[rowIndex][columnIndex] == row){
						result[rowIndex][columnIndex] = 40;
						count1++;
						break;
					}
				}
			}
			
			if(count1 == totalRows){
				for(int rowIndex=0 ; rowIndex<totalRows ; rowIndex++){			//it makes the output as to be printed if the number of queens are 4
					for(int columnIndex=0 ; columnIndex<totalRows ; columnIndex++){
						if(result[rowIndex][columnIndex] == 40){
							result[rowIndex][columnIndex] = 1;
						}
						else{
							result[rowIndex][columnIndex]=0;
						}
					}
				}
				return result;
			}
			return queensProblem(result, row-1, 0, totalRows, totalColumns);
		}
		
		for(int rowIndex=row+1 ; rowIndex<totalRows ; rowIndex++){		//it puts row+1 value vertically
			if(result[rowIndex][columnValue] == 0 ){
				result[rowIndex][columnValue] = row+1;
			}
		}
		
		for(int columnIndex=column+1 ; columnIndex<totalColumns ; columnIndex++){	//it puts row+1 value horizontally
			if(result[row][columnIndex] == 0){
				result[row][columnIndex] = row+1;
			}
		}
		for(int rowIndex=row, columnIndex=columnValue ; rowIndex<totalRows-1 && columnIndex<totalColumns-1 ;
						columnIndex++, rowIndex++){			//it puts row+1 value diagonallyin right side
			if(result[rowIndex+1][columnIndex+1] == 0){
				result[rowIndex+1][columnIndex+1] = row+1;
			}
		}
		for(int rowIndex=row, columnIndex = columnValue ; rowIndex<totalRows-1 && columnIndex>0 ;
					columnIndex--, rowIndex++){				//it puts row+1 value diagonally in left side			
			if(result[rowIndex+1][columnIndex-1] == 0){
				result[rowIndex+1][columnIndex-1] = row+1;
			}
		}

		for(int rowIndex=0 ; rowIndex<totalRows ; rowIndex++){		//it counts for the number of queens
			for(int columnIndex=0 ; columnIndex<totalColumns ; columnIndex++){
				if(result[rowIndex][columnIndex] == 40){
					count2++;
					break;
				}
			}
		}
		if(count2 == totalRows){						//it makes the output as to be shown if number of queens are 4	
			for(int rowIndex=0 ; rowIndex<totalRows ; rowIndex++){
				for(int columnIndex=0 ; columnIndex<totalRows ; columnIndex++){
	 
					if(result[rowIndex][columnIndex] == 40){
						result[rowIndex][columnIndex] = 1;
					}
					else{
						result[rowIndex][columnIndex]=0;
					}
				}
			}
			return result;
		}
		return queensProblem(result, row+1, column, totalRows, totalColumns);
	}
}
