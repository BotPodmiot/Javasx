import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class zgadywanie {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		out.println("wprowadź liczbę całkowitą od 1 do 10: ");

		int inputNumber = keyboard.nextInt();
		int RandomNumber = new Random().nextInt(10) + 1;
		if (inputNumber == RandomNumber) {
			out.println("********");
			out.println("Wygrałeś");
			out.println("********");
		} else {
			out.println("Przegrałeś");
			out.println("Liczba wynosiła " + RandomNumber);
		}
		keyboard.close();
	}
}
