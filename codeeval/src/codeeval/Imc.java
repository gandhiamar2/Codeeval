package codeeval;

import java.util.Arrays;
import java.util.HashMap;

public class Imc {
	public static void main(String[] args) {
		Imc task = new Imc();
		int[][] A = new int[7][3];
		A[0][0] = 5;
		A[0][1] = 4;
		A[0][2] = 4;
		A[1][0] = 4;
		A[1][1] = 2;
		A[1][2] = 4;
		A[2][0] = 3;
		A[2][1] = 2;
		A[2][2] = 4;
		A[3][0] = 2;
		A[3][1] = 2;
		A[3][2] = 2;
		A[4][0] = 3;
		A[4][1] = 3;
		A[4][2] = 4;
		A[5][0] = 1;
		A[5][1] = 4;
		A[5][2] = 4;
		A[6][0] = 4;
		A[6][1] = 1;
		A[6][2] = 1;

		task.solution(A);

	}

	public int solution(int[][] A) {

		int country = 0;

		int length = A.length;
		int breadth = A[0].length;
		String[][] count = new String[length][breadth];

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < breadth; j++) {

				if (count[i][j] == null)
					count[i][j] = ++country + "";

				if (count[i][j] != null) {
					if (j != A[i].length - 1) {
						if (A[i][j] == A[i][j + 1]) {
							if (count[i][j + 1] != null) {
								for (int m=0; m<count.length;m++) {

									for (int k=0; k<count[m].length;k++) {

										if (count[i][j + 1].equals(count[m][k]))

											count[m][k] = count[i][j];

									}

								}
							}
							count[i][j + 1] = count[i][j];
						}
					}
					if (i != A.length - 1) {
						if (A[i][j] == A[i + 1][j]) {
							if (count[i + 1][j] != null) {
								for (int m=0; m<count.length;m++) {

									for (int k=0; k<count[m].length;k++) {

										if (count[i + 1][j].equals(count[m][k]))

											count[m][k] = count[i][j];

									}

								}
							}
							count[i + 1][j] = count[i][j];
						}
					}
					if (j != 0) {
						if (A[i][j] == A[i][j - 1]) {
							if (count[i][j - 1] != null) {
								for (int m=0; m<count.length;m++) {

									for (int k=0; k<count[m].length;k++) {

										if (count[i][j - 1].equals(count[m][k]))

											count[m][k] = count[i][j];

									}

								}
							}
							count[i][j - 1] = count[i][j];
						}
					}
					if (i != 0) {
						if (A[i][j] == A[i - 1][j]) {
							if (count[i - 1][j] != null) {
								for (int m=0; m<count.length;m++) {

									for (int k=0; k<count[m].length;k++) {

										if (count[i - 1][j].equals(count[m][k]))

											count[m][k] = count[i][j];

									}

								}
							}
							count[i - 1][j] = count[i][j];
						}
					}

				}
			}
		}

		HashMap<String, String> countrycount = new HashMap<>();

		for (String[] strings : count) {

			for (String string : strings) {

				countrycount.put(string, string);
				System.out.print(string + " ");

			}
			System.out.println();
		}

		return countrycount.size();
		 

	}

}
