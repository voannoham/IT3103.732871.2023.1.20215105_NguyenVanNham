//Nguyen Van Nham 20215105
//ex 6.5 to sort a numeric array, and calculate the sum and average value of array elements.
package ooplab1;
import java.util.*;
class Array {
	public int n;
	public int iArray[] = new int[100];
	
	public void input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nguyen Van Nham 5105-enter n: ");
		n = keyboard.nextInt();
		System.out.println("Nguyen Van Nham 5105-enter values: ");
		for(int i=0; i<n; i++) {
			iArray[i] = keyboard.nextInt();
		}
	}
	
	public void sort() {
		for(int i= 0; i<n; i++) {
			int min_index = i;
			for(int j=i; j<n; j++) {
				if(iArray[j] < iArray[min_index]) {
					min_index = j;
				}
			}
			if(i != min_index) {
				int temp = iArray[i];
				iArray[i] = iArray[min_index];
				iArray[min_index] = temp;
			}
		}
		
		System.out.println("Nguyen Van Nham 5105 - sorted array: ");
		for(int i=0; i<n; i++) {
			System.out.print(iArray[i] + " ");
		}
		System.out.print("\n");
		return;
	}
	
	public void  calSumAndAverage() {
		long sum = 0;
		double avg;
		for(int i=0; i<n; i++) {
			sum += iArray[i];
		}
		avg = sum*1.0/n;
		System.out.println("Sum =  " + sum + " and Average = " + avg);
		return ;
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		a.input();
		a.sort();
		a.calSumAndAverage();

		return;
	}
}