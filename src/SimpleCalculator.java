

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < args.length; i++) {
			
		}
String num1 = JOptionPane.showInputDialog("Say a number");
String num2 = JOptionPane.showInputDialog("Say another number");

int Num1 = Integer.parseInt(num1);
int Num2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Choose what to do", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
System.out.println(operation);
if (operation==0) {
	int add = add(Num1,Num2);
	JOptionPane.showMessageDialog(null, add);
} 
if (operation==1) {
	int subtract=subtract(Num1,Num2);
	JOptionPane.showMessageDialog(null, subtract);
} 
if (operation==2) {
	int multiply=multiply(Num1,Num2);
	JOptionPane.showMessageDialog(null, multiply);
} 
if (operation==3) {
	int divide=divide(Num1,Num2);
	JOptionPane.showMessageDialog(null, divide);

} 
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static int add(int Num1,int Num2){
int Num3 = Num1 + Num2;
return Num3;
}
static int subtract(int Num1,int Num2){
int Num3 = Num1 - Num2;
return Num3;
}
static int multiply(int Num1,int Num2){
int Num3 = Num1 * Num2;
return Num3;
}
static int divide(int Num1,int Num2){
int Num3 = Num1 / Num2;
return Num3;
}

	// 4. Create similar methods for subtraction, multiplication and division.
}