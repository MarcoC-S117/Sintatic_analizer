package Sintatic;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the input string: ");
	        String inputString = scanner.nextLine();

	        Analizer parser = new Analizer(inputString);
	        if (parser.S()) {
	            System.out.println("The string \"" + inputString + "\" belongs to the grammar (language).");
	        } else {
	            System.out.println("The string \"" + inputString + "\" does not belong to the grammar (language).");
	            parser.syntaxError();
	        }

	        scanner.close();
	    }
	 

}
