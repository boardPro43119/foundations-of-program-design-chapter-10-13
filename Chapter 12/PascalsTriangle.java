import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args){

		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("Row to print: ");
		n = in.nextInt();

		int[] arr = getPascalRow(n);

		for(int i=0; i<n+1; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}

	public static int[] getPascalRow(int row){
		int[] rowElements = new int[row+1];

		rowElements[0] = 1;
		rowElements[row] = 1;

		for(int i=1; i<row; i++){

			rowElements[i] = getPascalRow(row-1)[i-1] + getPascalRow(row-1)[i];

		}

		return rowElements;

	}

}