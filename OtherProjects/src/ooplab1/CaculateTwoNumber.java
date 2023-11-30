//Nguyen Van Nham 20215105
//calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
package ooplab1;
import javax.swing.JOptionPane;
public class CaculateTwoNumber{
  public static void main(String[] args){
      String strNum1, strNum2;
	double sum, difference, product, quotient;

      strNum1 = JOptionPane.showInputDialog(null,
      	"Please input the first number: ","Input the first number",
		JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);
	
	strNum2 = JOptionPane.showInputDialog(null,
		"Please input the second number: ","Input the second number",
		JOptionPane.INFORMATION_MESSAGE);
	double num2 = Double.parseDouble(strNum2);
	sum = num1 + num2;
      difference = num1 - num2;
      product = num1 * num2;
      
      JOptionPane.showMessageDialog(null,"sum of two numbers is " + sum);
      JOptionPane.showMessageDialog(null,"difference of two numbers is " + difference);
      JOptionPane.showMessageDialog(null,"product of two numbers is " + product);
	
	if (num2 != 0){
	    quotient = num1 / num2;
          JOptionPane.showMessageDialog(null,"quotient of two numbers is " + quotient);
	}
	else{
          JOptionPane.showMessageDialog(null,"the divisor = 0! invalid!");
	}
	System.exit(0);
  }
}