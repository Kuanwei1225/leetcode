
public class Solution {

	public static void rotate(int[][] matrix) {
		int len = matrix.length;
		int[][] newMat = new int[len][len];
		for (int j = 0; j < len; j++)
			for (int k = 0; k < len; k++) {
				newMat[k][len - j - 1] = matrix[j][k];
			}
		matrix = newMat;
	}

	public static void main(String args[]) {
		int[][] input = new int[3][3];
		// initial array
		for (int i = 0, j = 1; i < 3; i++) {
			for (int k = 0; k < 3; k++, j++)
				input[i][k] = j;
			System.out.println(input[i]);
		}
		rotate(input);
		System.out.println();
		System.out.println(input[0]);
		System.out.println(input[1]);
		System.out.println(input[2]);

	}
}
