import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by dominikolczyk on 12.04.2016.
 */
public class MenuForm extends JFrame{
	private JButton dupaButton;
	private JPanel root;

	public MenuForm() {
		super("Hello");
		setContentPane(root);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dupaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(MenuForm.this,"DUAPODAJSDASD");
			}
		});
		setVisible(true);
	}
}
