import java.util.Scanner;

public class PigLatinPrompt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean repeat = true;
		
		while (repeat) {
			System.out.print("Enter a word or phrase to be translated into pig latin: ");
			String userInput = scnr.nextLine();
			System.out.println(PigLatin.translate(userInput));
			repeat = optionToRepeat(scnr);
		}
		
		System.out.println("eeSay ouyay aterlay!");
		
		
		scnr.close();
	}
	public static boolean optionToRepeat(Scanner scnr) {
		System.out.print("Would you like to go again? y/n ");
		String userChoice = scnr.nextLine();
		if (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")) {
			return optionToRepeat(scnr);
		}
		return userChoice.equalsIgnoreCase("y");
	}
	
}
