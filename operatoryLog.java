import javax.swing.JOptionPane;

public class operatoryLog {

	public static void main(String args[]) {

		String userName = JOptionPane.showInputDialog("User name: ");
		String userPassword = JOptionPane.showInputDialog("Password: ");

        if (userName != null && userPassword != null &&                 // && == and
        (userName.equals("Podmiot") && userPassword.equals("OKs")) ||  //  || == or 
        (userName.equals("Java") && userPassword.equals("JDK"))
        )  {
            JOptionPane.showMessageDialog(null, "jesteś zalogowany");
        } else {
            JOptionPane.showMessageDialog(null, "XD");
        }
    }   
}