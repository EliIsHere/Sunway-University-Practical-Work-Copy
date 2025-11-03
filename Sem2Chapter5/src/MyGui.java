import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyGui implements ActionListener{
	JFrame frame;
	JLabel lb1, lb2, lb3;
	JTextField tf1, tf2, tf3;
	JButton bt1;
	
	MyGui () {
		frame = new JFrame("calculation");
		lb1= new JLabel("number 1");
		lb2= new JLabel("number 2");
		lb3= new JLabel("Answer");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		bt1 = new JButton("add");
		
		bt1.addActionListener(this);
		GridLayout grid = new GridLayout(4,2);
		frame.setLayout(grid);
		frame.add(lb1);
		frame.add(tf1);
		frame.add(lb2);
		frame.add(tf2);
		frame.add(lb3);
		frame.add(tf3);
		frame.add(bt1);
		
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new MyGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=0, num2=0, ans=0;
		num1 = Integer.parseInt(tf1.getText());
		num2 = Integer.parseInt(tf2.getText());
		MyNumber mn = new MyNumber();
		try {
			ans = mn.calc(num1, num2);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, ex.getMessage());
		}
		tf3.setText(ans+"");		
	} 
}