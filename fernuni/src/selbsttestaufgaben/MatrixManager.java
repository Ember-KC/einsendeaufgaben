package selbsttestaufgaben;

public class MatrixManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[][] matrixEintraege = { { 1, 2, 3, 4, }, { 1, 2, 3, 4 },
				{ 1, 2, 3, 4 } };
		Matrix testmatrix = new Matrix(matrixEintraege);
		testmatrix.transponiere();
		testmatrix.addiereMit(testmatrix);

	}
}
