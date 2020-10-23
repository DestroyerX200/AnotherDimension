public class Tester {
	public static void main(String[] args) {
		int[]  A  =   {  1, 12, 23 };
		int[]  B  =   {  1, 3, 5 };
		int[]  C  = {50};

		System.out.println("sum test cases:");
		System.out.println(ArrayOps.sum(A));
		System.out.println(ArrayOps.sum(B));
		System.out.println(ArrayOps.sum(C));
		System.out.println();

		System.out.println("largest test cases:");
		System.out.println(ArrayOps.largest(A));
		System.out.println(ArrayOps.largest(B));
		System.out.println(ArrayOps.largest(C));
		System.out.println();

    }
}