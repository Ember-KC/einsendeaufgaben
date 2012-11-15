package selbsttestaufgaben;

class Matrix {

	double[][] eintraege;

	Matrix(int x, int y) {
		if (x <= 0 || y <= 0) {
			System.out.println("Ungueltige Matrixgroesse.");
			return;
		}
		this.eintraege = new double[x][y];
	}

	Matrix(final double[][] eintraege) {
		if (eintraege.length <= 0 || eintraege[0].length <= 0) {
			System.out.println("Keine gueltige Matrix.");
			return;
		}
		// hier sollten die Werte kopiert werden
		// damit bei Veraenderungen des übergebenen Feldes
		// nicht die eigenen Einträge veraender werden
		this.eintraege = new double[eintraege.length][eintraege[0].length];
		for (int i = 0; i < this.eintraege.length; i++) {
			double[] e = eintraege[i];
			if (e.length != this.eintraege[0].length) {
				System.out.print("Eine Matrix muss ");
				System.out.println("rechteckig sein.");
				return;
			}
			for (int j = 0; j < this.eintraege[i].length; j++) {
				this.eintraege[i][j] = e[j];
			}
		}
	}

	Matrix transponiere() {
		Matrix transponiert = new Matrix(this.eintraege[0].length,
				this.eintraege.length);
		for (int i = 0; i < this.eintraege.length; i++) {
			for (int j = 0; j < this.eintraege[i].length; j++) {
				transponiert.eintraege[j][i] = this.eintraege[i][j];
			}
		}
		return transponiert;
	}

	Matrix addiereMit(Matrix m) {
		if (m.eintraege.length != this.eintraege.length
				|| m.eintraege[0].length != this.eintraege[0].length) {
			System.out.print("Die Matrizen haben nicht die ");
			System.out.println("gleiche Groesse.");
			return null;
		}
		Matrix summe = new Matrix(this.eintraege.length,
				this.eintraege[0].length);
		for (int i = 0; i < this.eintraege.length; i++) {
			for (int j = 0; j < this.eintraege[i].length; j++) {
				summe.eintraege[i][j] = this.eintraege[i][j]
						+ m.eintraege[i][j];
			}
		}
		return summe;
	}
}