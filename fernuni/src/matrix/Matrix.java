package matrix;

public class Matrix {

	public int[][] addiereMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] ergebnis = new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				ergebnis[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return ergebnis;
	}

	public int[][] transponiereMatrix(int[][] matrix) {
		int[][] ergebnis = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < ergebnis.length; i++) {
			for (int j = 0; j < ergebnis[0].length; j++) {
				ergebnis[i][j] = matrix[j][i];
			}
		}
		return ergebnis;
	}

	public int minimumErmitteln(int[][][] matrix) {
		int min = matrix[0][0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i][j].length; k++) {
					if (matrix[i][j][k] < min) {
						min = matrix[i][j][k];
					}
				}
			}
		}
		return min;
	}
}
