package demo01.ex1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_Sender extends JFrame {
	/**
	 * 
	 */
	public GUI_Sender() {
		setTitle("Khung chat");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnChinh = new JPanel();

	}

	public static void main(String[] args) {
		new GUI_Sender().setVisible(true);
	}
}
