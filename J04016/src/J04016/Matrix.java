package J04016;

import java.util.Scanner;

public class Matrix {
	private int row, col;
	private int[][] matrix;
	
	public Matrix(int row, int col) {
		super();
		this.row = row;
		this.col = col;
		matrix = new int[row][col];
	}
	
	
	
	public Matrix(int row, int col, int[][] matrix) {
		super();
		this.row = row;
		this.col = col;
		this.matrix = matrix;
	}



	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}


	/**
	 * @return the col
	 */
	public int getCol() {
		return col;
	}


	/**
	 * @return the matrix
	 */
	public int[][] getMatrix() {
		return matrix;
	}



	public Matrix(int[][] matrix) {
		super();
		this.matrix = matrix;
	}



	private Matrix nextMatrix1(Scanner sc) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return new Matrix(row, col, matrix);
	}

	public Matrix nextMatrix(Scanner sc) {
		return this.nextMatrix1(sc);
	}

	
	private Matrix mul(Matrix fi, Matrix se) {
		int[][] res = new int[fi.getRow()][se.getCol()];
		for(int i = 0; i < fi.getRow(); i++) {
			for(int j = 0; j < se.getCol(); j++) {
				res[i][j] = 0;
				for(int k = 0; k < fi.getCol(); k++) {
					res[i][j] += fi.getMatrix()[i][k]*se.getMatrix()[k][j];
				}
			}
		}
		return new Matrix(fi.getRow(), se.getCol(), res);
	}
	
	public Matrix mul(Matrix se) {
		return mul(this, se);
	}
	
	public String toString() {
		String ans = "";
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				ans += String.valueOf(matrix[i][j]) + ' ';
			}
			ans = ans.trim() + "\n";
		}
		return ans;
	}
	
}
