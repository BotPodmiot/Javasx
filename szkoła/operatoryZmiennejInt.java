import static java.lang.System.out;

public class operatoryZmiennejInt {
	public static void main(String[] args) {
		int number;
		number = 23;
		++number;
		/*
		 * out.println(number);
		 * out.println(++number); // ++ dodaje 1 przed wykonaniem operacji
		 * out.println(number);
		 */
		out.println(number);
		out.println(number++); // ++ dodaję 1 dopiero po wykonaniu operacji
		out.println(number);
	}
}
