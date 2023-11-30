//Nguyen Van Nham 20215015
//ex6.6	add two matrices of the same size
package ooplab1;
import java.util.*;
public class AddTwoMatrices {
	
	public static void main(String[] agvs) {
		Scanner keyboard = new Scanner(System.in);
		int row, col;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] result = new int[100][100];
		
		
		System.out.print("Nguyen Van Nham 5105-number of rows: "); 
		row = keyboard.nextInt();
		System.out.print("number of column: ");
		col = keyboard.nextInt();
		
		System.out.println("Nguyen Van Nham 5105-enter element matrice A[][]:");
		for(int i=0; i < row; i++) 
			for(int j=0; j< col; j++) a[i][j] = keyboard.nextInt();
		System.out.println("Nguyen Van Nham 5105-enter element matrice B[][]:");
		for(int i=0; i < row; i++) 
			for(int j=0; j < col; j++)	b[i][j] = keyboard.nextInt();
		
		for(int i=0; i < row; i++)
			for(int j=0; j < col; j++) result[i][j] = a[i][j] + b[i] [j];
		
		System.out.println("Nguyen Van Nham 5105-Sum is: ");
		for(int i= 0; i < row; i++) {
			for(int j=0; j < col; j++) System.out.print(result[i][j] + " ");
			System.out.print("\n");
		}
			
	}
}