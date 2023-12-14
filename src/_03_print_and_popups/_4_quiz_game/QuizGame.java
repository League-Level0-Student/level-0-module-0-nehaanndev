package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int userScore = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String questionColors = JOptionPane.showInputDialog("TRUE OR FALSE. Blue and red make purple?");
		String questionAtoms = JOptionPane.showInputDialog("TRUE OR FALSE. An atom is the smallest particle?");
		String questionPeople = JOptionPane.showInputDialog("TRUE OR FALSE. Colorblind people can see color?");

		// 3. Use an if statement to check if their answer is correct
		if (questionColors.equalsIgnoreCase("true")) {
			userScore = userScore + 1;
		}else if (questionColors.equalsIgnoreCase("flase")) {
			userScore = userScore - 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Only enter true or false.");
		}
		if (questionAtoms.equalsIgnoreCase("true")) {
			userScore = userScore + 1;
		}else if (questionAtoms.equalsIgnoreCase("flase")) {
			userScore = userScore - 1;
		}else {
			JOptionPane.showMessageDialog(null, "Only enter true or false.");
		}
		if (questionPeople.equalsIgnoreCase("true")) {
			userScore = userScore + 1;
		}else if (questionPeople.equalsIgnoreCase("flase")) {
			userScore = userScore - 1;
		}else {
			JOptionPane.showMessageDialog(null, "Only enter true or false.");
		}
		JOptionPane.showMessageDialog(null, userScore);

		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer

		// After all the questions have been asked, tell the user their final score

	}
}
