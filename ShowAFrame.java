import javax.swing.JFrame;

public class ShowAFrame {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame(); // JFrame - typ okno
		String TitleFrame = "Pusta ramka";

		myFrame.setTitle(TitleFrame);
		myFrame.setSize(400, 600); // piksele
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mówimy żę okno zamyka się gdy je zamkniemy
		myFrame.setVisible(true);
	}
}