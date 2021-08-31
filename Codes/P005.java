//GUI

import javax.swing.JOptionPane;

public class P005 {
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " +name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Your Age is" +age);
	}
}