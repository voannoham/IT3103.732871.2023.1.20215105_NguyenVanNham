
//Nguyen Van Nham 20215105
//ChoosingOption program
package ooplab1;
import javax.swing.JOptionPane;
public class ChoosingOption{
	public static void main(String[] args) {
      int option = JOptionPane.showConfirmDialog(null,
      			"Nguyen Van Nham 5105-do you want to change the first class ticket?");
      JOptionPane.showMessageDialog(null,"Nguyen Van Nham 5105-you have chosen:" 
      				+ (option == JOptionPane.YES_OPTION?" yes ":" No " ));
      System.exit(0);
	}
}
