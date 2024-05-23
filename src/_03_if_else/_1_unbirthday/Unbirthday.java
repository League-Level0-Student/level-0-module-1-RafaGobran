package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("When is your birthday");
		if("May 23rd".equalsIgnoreCase(input)) {
			JOptionPane.showMessageDialog(null, "Happy birthday!" );
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!" );

		}
		

			
		}
	}

