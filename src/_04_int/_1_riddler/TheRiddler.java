package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String input = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
					"Who buys it, has no use for it. \n" + 
					"Who uses it can neither see nor feel it. \n" + 
					"What is it?");
		
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if("coffin".equalsIgnoreCase(input)) {
				JOptionPane.showMessageDialog(null, "correct");
			}
		// 5. Otherwise, say "wrong" and tell them the answer
			else
				JOptionPane.showMessageDialog(null, "wrong, it was coffin ");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

