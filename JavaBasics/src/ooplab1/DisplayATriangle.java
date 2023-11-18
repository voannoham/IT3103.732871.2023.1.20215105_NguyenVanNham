package ooplab1;
//Nguyen Van Nham 20215105
//ex6.3 display a triangle with a height of n stars (*), n is entered by users.
import java.util.Scanner;
public class DisplayATriangle {
  public static void main(String arg[]) {
  	Scanner keyboard = new Scanner(System.in);
  	
  	System.out.println("Nguyen Van Nham 20215105-enter n: ");
  	double n = keyboard.nextDouble();
  	int i, j;
  	for (i = 1; i <= n; i++) {
  		for (j = 1; j <= n - i; j++ ) {
  			System.out.print(" ");
  		}
  		for (j = 1; j <= 2 * i -1; j += 1) {
  			System.out.print("*");
  		}
  		System.out.print("\n");
  	}
  }
}
