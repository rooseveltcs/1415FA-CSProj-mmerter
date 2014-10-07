package learningSwingUi;

//packages it all together, I think.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//imports

public class learningSwingUi {
	// the frame that holds everything
	private JFrame mainFrame;
	// text fields for the user's input
	private JTextField inputFieldOne;
	private JTextField inputFieldTwo;
	// labels to display errors and results of succseful operations.
	private JLabel errorLabel;
	private JLabel placeholderLabel;
	private JLabel resultLabel;
	// panel that holds things inside the frame
	private JPanel controlPanel;

	//creates the gui
	public learningSwingUi() {
		prepareGUI();
	}

	public static void main(String[] args) {
		learningSwingUi swingTest = new learningSwingUi();
		swingTest.showActionListenerDemo();
	}

	private void prepareGUI() {
		//initializes the frame
		mainFrame = new JFrame("Java Learning Swing");
		mainFrame.setSize(400, 400);
		//sets the layout style
		mainFrame.setLayout(new GridLayout(0, 3));

		//initializes the components of the frame.
		inputFieldOne = new JTextField();
		inputFieldTwo = new JTextField();
		resultLabel = new JLabel("results here");
		placeholderLabel = new JLabel("Welcome!");
		errorLabel = new JLabel("Errors show here");
		//creates the control panel.
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		//adds everything to the frame.
		mainFrame.add(inputFieldOne);
		mainFrame.add(controlPanel);
		mainFrame.add(inputFieldTwo);
		mainFrame.add(placeholderLabel);
		mainFrame.add(resultLabel);
		mainFrame.add(errorLabel);
		mainFrame.setVisible(true);
	}

	private void showActionListenerDemo() {
		//adds text to the textfields, and adds the button.
		inputFieldOne.setText("put one number here");
		inputFieldTwo.setText("put another here");
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		JButton okButton = new JButton("Add the numbers!");
		//listens to the button. Do you hear the button?
		okButton.addActionListener(new CustomActionListener());
		panel.add(okButton);
		controlPanel.add(panel);
	}

	class CustomActionListener implements ActionListener {
		//does something when the button is clicked.
		public void actionPerformed(ActionEvent e) {
			//Prints the answer or an error if the person typed something silly.
			String inputOne = inputFieldOne.getText();
			String inputTwo = inputFieldTwo.getText();
			int addedInput;
			int testForNumberOne = testForBadInput(inputOne);
			int testForNumberTwo = testForBadInput(inputTwo);
			addedInput = testForNumberOne + testForNumberTwo;
			if (addedInput != 0){
				resultLabel.setText("" + addedInput);
				errorLabel.setText("---");
			}else{
				errorLabel.setText("An error occured.");
				resultLabel.setText("---");
			}
		}
		
		//decides whether the input typed by the user is a number or not.
		public int testForBadInput(String input) {
			int temp;
			try {
				temp = Integer.parseInt(input);
			} catch (java.lang.NumberFormatException e1) {
				return 0;
			}
			return temp;
		}
	}
}
