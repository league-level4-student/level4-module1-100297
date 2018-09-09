package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		switch(choice) {
		case "Sunday":
			System.out.println("minor good'");
			break;
		case "Monday":
			System.out.println("very bad'");
			break;
		case "Tuesday":
			System.out.println("still asleep");
			break;
		case "Wednesday":
			System.out.println("normal bad'");
			break;
		case "Thursday":
			System.out.println("slightly better");
			break;
		case "Friday":
			System.out.println("much better");
			break;
		case "Saturday":
			System.out.println("major good'");
			break;
		}
		//use a switch statement to do something cool for each option
		
	}
}
