package J04017;

import java.util.Scanner;

public class Matrix {
	private int row, col, matrix[][];

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

	
	private Matrix next(Scanner sc) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return new Matrix(row, col, matrix);
	}
	
	public Matrix nextMatrix(Scanner sc) {
		return this.next(sc);
	}
	
	public Matrix trans() {
		int[][] res = new int[col][row];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				res[j][i] = matrix[i][j];
			}
		}
		return new Matrix(col, row, res);
	}
	
	private Matrix mul(Matrix fi, Matrix se) {
		int row = fi.getRow(), col = se.getCol(), tmp = fi.getCol();
		int a[][] = fi.getMatrix(), b[][] = se.getMatrix(), res[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				res[i][j] = 0;
				for(int k = 0; k < tmp; k++) {
					res[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		return new Matrix(row, col, res);
	}
	
	public Matrix mul(Matrix se) {
		return mul(this, se);
	}
	
	public String toString() {
		String ans = "";
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				ans += matrix[i][j] + " ";
			}
			if(i < row-1)
			ans = ans.trim() + "\n";
		}
		return ans;
	}
	
}
