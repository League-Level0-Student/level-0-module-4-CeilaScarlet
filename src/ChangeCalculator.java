//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nic = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nic = Integer.parseInt(Nic);
		// Ask the user how many dimes they have, and convert their answer
String Dim = JOptionPane.showInputDialog("How many dimes do you have");
int dim = Integer.parseInt(Dim);
		// Ask the user how many quarters they have, and convert their answer
String Qua = JOptionPane.showInputDialog("How many quarters do you have?");
int qua = Integer.parseInt(Qua);
		// Calculate how much money the user has and save it in a double variable 
double Count = 0.0;
Count +=nic*.05;
Count+=dim*.10;
Count+=qua*.25;
System.out.println(Count);
		// Tell the user how much money they have

	}
}

