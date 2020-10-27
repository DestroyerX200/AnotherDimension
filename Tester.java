import java.util.Arrays;
public class Tester {
	public static void main(String[] args) {
		int[] A  =   {  1, 12, 23 };
		int[] B  =   {  1, 3, 5 };
		int[] C  = {50};

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

		int[][] D = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
        int[][] E = { {  1,  2, 3, 4 },
   					{  2, 3,  4,  1 },
   					{ 3, 4,  1, 2 } };

   		int[][] F = { {  1,  1, 1 },
   					{  2, 2, 2 },
   					{ 3,  3, 3 } };

        System.out.println(Arrays.toString(ArrayOps.sumRows(D)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(D)));
        System.out.println(ArrayOps.sum(D));

        System.out.println(Arrays.toString(ArrayOps.sumCols(D)));

        System.out.println(ArrayOps.isRowMagic(D));
        System.out.println(ArrayOps.isRowMagic(E));
        System.out.println(ArrayOps.isRowMagic(F));

    }
}