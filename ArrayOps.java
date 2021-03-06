public class ArrayOps {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int largest(int[]arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	public static int[] sumRows(int[][] matrix) {
		int[] a = new int[matrix.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = sum(matrix[i]);
		}
		return a;
	}
	public static int[] largestInRows(int[][] matrix) {
		int[] a = new int[matrix.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = largest(matrix[i]);
		}
		return a;
	}
	public static int sum(int[][] arr) {
		int[] a = sumRows(arr);
		return sum(a);
	}
	public static int[] sumCols(int[][] matrix) {
		int numCols = 0;
		if (matrix.length != 0) {
			numCols = matrix[0].length;
		}
		int[] a = new int[numCols];
		for (int i = 0; i < numCols; i++) {
			for (int j = 0; j < matrix.length; j++) {
				a[i] += matrix[j][i];
			}
		}
		return a;
	}
	public static boolean isRowMagic(int[][] matrix) {
		int[] a = sumRows(matrix);
		int sum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != sum) {
				return false;
			}
		}
		return true;
		
	}
	public static boolean isColMagic(int[][] matrix) {
		int[] a = sumCols(matrix);
		int sum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != sum) {
				return false;
			}
		}
		return true;
	}
	public static boolean isLocationMagic(int[][] matrix, int row, int col) {
		int[] rowSums = sumRows(matrix);
		int[] colSums = sumCols(matrix);
		return rowSums[row] == colSums[col];
	}
}