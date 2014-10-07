import java.util.ArrayList;
import java.util.Scanner;

public class Firstassignment {

	public static void main(String[] args) {
		// greetings.
		System.out.println("Enter a number between 1-100 that you would like factored,");
		System.out.println("or enter two numbers to find their greater common demoninator,");
		System.out.println("or type \"Quit\" to exit.");
		// Variables and lists to store various inputs/factors
		int firstInput = 0;
		int secondInput = 0;
		ArrayList<Integer> firstFactors = new ArrayList<Integer>();
		ArrayList<Integer> secondFactors = new ArrayList<Integer>();
		String[] gottenInput;
		//infinite loop, goes until it gets valid input.
		while (!false) {
			//if first input is valid and second is not, factor
			if (firstInput != 0 && secondInput == 0) {
				firstFactors = factor(firstInput);
				System.out.println(firstFactors.toString());
				break;
			//if both inputs are valid, factors and then prints their GDC
			} else if (firstInput != 0 && secondInput != 0) {
				int theAnswer = greaterCommonDenominator(firstInput, secondInput, firstFactors, secondFactors);
				System.out.println(theAnswer);
				break;
			//invalid input, gets and parses new input.
			} else {
				System.out.println("Please enter a Valid Input.");
				gottenInput = getInput();
				firstInput = parseInput(gottenInput[0]);
				secondInput = parseInput(gottenInput[1]);
			}
		}
	}

	public static int greaterCommonDenominator(int firstInput, int secondInput, ArrayList<Integer> firstFactors, ArrayList<Integer> secondFactors) {
		//factors and stores the user inputed numbers.
		firstFactors = factor(firstInput);
		secondFactors = factor(secondInput);
		//math to check for GDC
		int factorCompare;
		int gdc = 0;
		for (int i = 0; i <= firstFactors.size() - 1; i++) {
			factorCompare = firstFactors.get(i);
			if (secondFactors.contains(factorCompare)) {
				if (firstFactors.get(i) > gdc) {
					gdc = firstFactors.get(i);
				}
			}
		}
		//returns to allow for easier testing.
		return gdc;
	}

	public static ArrayList<Integer> factor(int factoredNumber) {
		//list to store factors.
		ArrayList<Integer> localFactors = new ArrayList<Integer>();
		//using a double in the math caused an input of 1 to round down and return zero - this is the quick fix.
		if (factoredNumber == 1) {
			localFactors.add(1);
		} else {
			//factoring math.
			for (double i = factoredNumber / 2; i >= 1; i--) {
				if ((int) (factoredNumber / i) * i == factoredNumber
						&& i < factoredNumber / i) {
					localFactors.add((int) i);
					localFactors.add((int) (factoredNumber / i));
				}
			}
		}
		//returns allow testing, results of factoring are printed above.
		return localFactors;
	}

	public static String[] getInput() {
		//console never closed, and I did not like the warning.
		@SuppressWarnings("resource")
		//scanner is used to get input.
		Scanner console = new Scanner(System.in);
		//stores possible two inputs to be parsed.
		String[] storedInput = new String[2];
		//used to send console input to the rest of the program.
		String userInput;
		if (console.hasNextLine()) {
			userInput = console.nextLine();
			userInput.toLowerCase();
			if (userInput.equals("quit")) {
				System.out.println("Have a nice day.");
				System.exit(0);
			} else {
				//splits input to an array in a different method for testing purposes.
				storedInput = userInputToArray(storedInput, userInput);
			}
		} else {
			// console will blink forever, but computer logic.
			return storedInput;
		}
		return storedInput;
	}

	public static String[] userInputToArray(String[] storedInput,String userInput) {
		if (userInput.contains(" ")) {
			storedInput = userInput.split(" ");
		} else {
			storedInput[0] = userInput;
		}
		return storedInput;
	}

	public static int parseInput(String inputInput) {
		int numberInput;
		//checks if the input is a number.
		try {
			numberInput = Integer.parseInt(inputInput);
		} catch (java.lang.NumberFormatException e1) {
			return 0;
		}
		if (numberInput >= 1 && numberInput <= 100) {
			return numberInput;
		}
		return 0;
	}

}