import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


import static com.sun.glass.ui.Cursor.setVisible;


public class MenuForm extends JFrame{
	private JButton dupaButton;
	private JPanel root;
	private JButton a2GRACZYButton;
	private JButton WCZYTAJGRĘButton;
	private JButton ZAGADKITAKTYCZNEButton;
	private JButton GRAZKOMPUTEREMButton;
	private JRadioButton muzykaOffRadioButton;

	public MenuForm() {
		super("Hello");
		setContentPane(root);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GRAZKOMPUTEREMButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				opcjeCzasu o = new opcjeCzasu();
			}
		});

		setVisible(true);
		Clip clip=null;
		try{
			AudioInputStream audioInputStream =
					AudioSystem.getAudioInputStream(
							this.getClass().getResource("/music.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			//clip.start();
			clip.loop(100);
		}


		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

		final Clip clip1 = clip;
		muzykaOffRadioButton.addActionListener(new ActionListener() {

			int clicked =0;

			@Override
			public void actionPerformed(ActionEvent e) {

				if(clicked % 2 ==0){
					clip1.stop();
				}else{
					clip1.loop(100);
				}
				clicked++;
			}
		});

	}

	private void createUIComponents() {
		// TODO: place custom component creation code here
	}
}
