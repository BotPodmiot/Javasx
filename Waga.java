import java.util.Scanner;
import static java.lang.System.out;
public class Waga {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("(K)g or (L)bs: "); 
        String LBS = "L";
        String KG = "K";
        String Z = keyboard.next();
        out.println("Wartość");
        float X = keyboard.nextFloat();
                if (Z.toUpperCase() == LBS) {
            out.println("Waga w Kg to " + X*0.45);     
        } if (Z.equalsIgnoreCase(KG)) {      
            out.println("Waga w funtach to " + X/0.45);
        }
        keyboard.close();
    }
}