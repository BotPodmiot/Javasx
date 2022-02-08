import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String args[]) {

        int verse = Integer.parseInt(JOptionPane.showInputDialog("Verse: "));

        switch (verse) {

            case 1:
                JOptionPane.showMessageDialog(null, "wybrałeś opcję 1.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "wybrałeś opcję 2.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "wybrałeś opcję 3.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "nie wybrałeś poprawnej opcji D:");
                break;
        }
        JOptionPane.showMessageDialog(null, "koniec");
    }
}
