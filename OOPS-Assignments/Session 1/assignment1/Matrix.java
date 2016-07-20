/**
 * 
 */
package assignment1;

/**
 * @author Ajinkya Pande
 *
 */
public class Matrix {

	int[][] matrix;
	// Constructor for initialize matrix
	public Matrix(int rows, int cols) throws NegativeArraySizeException {
		if(rows <= 0 || cols <= 0){
			throw new NegativeArraySizeException();
		}
		matrix = new int[rows][cols];
	}
	
	// This function add elements at given position
	public boolean addElements(int value, int row, int col)
			throws ArrayIndexOutOfBoundsException {
		boolean flag = false;
		if (!(row < matrix.length || col < matrix[0].length)) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			matrix[row][col] = value;
			flag = true;

		}
		return flag;
	}
	// This function will return the matrix 
	public int[][] show() {
		return matrix;
	}
	
	// This function will return the value of matrix at given position
	public int show(int row, int col) {
		return matrix[row][col];
	}
	
	// This will return the transpose of matrix
	public int[][] transpose() {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] tran_matrix = new int[col][row];
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				tran_matrix[i][j] = matrix[j][i];
			}
		}
		return tran_matrix;
	}
	
	// This function will return the multiplication of two matrix
	public int[][] multiply(int[][] matrix1,int[][] matrix2) throws IllegalArgumentException{
		int matrix1_row = matrix1.length;
		int matrix1_col = matrix1[0].length;
		int matrix2_row = matrix2.length;
		int matrix2_col = matrix2[0].length;
		int sum=0;
		int [][] multiply_matrix = new int [matrix1_row][matrix2_col];
		if(matrix1_col != matrix2_row){
			throw new IllegalArgumentException();
		}
		else{
			for(int i=0;i<matrix1_row;i++){
				for(int j=0;j<matrix2_col;j++){
					for(int k=0;k<matrix1_col;k++){
						sum = sum+matrix1[i][k]*matrix2[k][j];
					}
					multiply_matrix[i][j] = sum;
					sum=0;
				}
			}
		}
		return multiply_matrix;
	}
}
