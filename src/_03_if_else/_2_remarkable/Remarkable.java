package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String merrick = "he is amazing at basketball and football";
String julian = "he is amazing at baseball and soccer";
String lucca = "he is amazing at pickleball";
String rafa = "he is amazing at gaming and tennis";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input= JOptionPane.showInputDialog("enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 

if("merrick".equalsIgnoreCase(input)){
	JOptionPane.showMessageDialog(null, merrick);
}
if("rafa".equalsIgnoreCase(input)){
	JOptionPane.showMessageDialog(null, rafa);
}
	if("lucca".equalsIgnoreCase(input)){
		JOptionPane.showMessageDialog(null, lucca);
	}
		if("julian".equalsIgnoreCase(input)){
			JOptionPane.showMessageDialog(null, julian);
}
}
}

