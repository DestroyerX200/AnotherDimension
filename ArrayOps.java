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
	
}