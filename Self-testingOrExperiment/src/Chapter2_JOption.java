import javax.swing.*;

public class Chapter2_JOption {
	public static void mian (String args[]) {
		String snum1 = JOptionPane.showInputDialog("Enter a number: ");
		String snum2 = JOptionPane.showInputDialog("Enter another number: ");
		
		//converting the strings to int
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		
		//Sum
		int sum = num1 + num2;
		
		//Display results
		String temp = num1 + "+" + num2 + "=" + sum;
		JOptionPane.showMessageDialog(null,  temp);
		
	}

}
