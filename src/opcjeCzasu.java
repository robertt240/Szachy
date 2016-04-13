import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;
/**
 * Created by Iza on 2016-04-13.
 */
public class opcjeCzasu extends JFrame{

    private JPanel root2;
    private JButton OKButton;
    private JFormattedTextField NICKFormattedTextField;
    private JRadioButton BULLETRadioButton;
    private JRadioButton BLITZRadioButton;
    private JRadioButton RAPIDRadioButton;
    private JRadioButton STANDARDRadioButton;

    public opcjeCzasu() {
        super("Hello");
        setContentPane(root2);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


}
