import java.util.Scanner;
public class SScanner{
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in); //definiujemy scanner
    int wiek = keyboard.nextInt();           //input inta
    wiek -= 2021;
    wiek *= -1;
    System.out.println(wiek);
    keyboard.close();
    }
}