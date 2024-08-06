import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingForm {
    private JPanel greetingPanel;
    private JTextField txtgreeting;
    private JButton btn_greeting;
    public GreetingForm() {
        btn_greeting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtgreeting.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("Greeting Form");
        frame.setContentPane(new GreetingForm().greetingPanel);
        frame.setSize(200,300);
        frame.pack();
        frame.setVisible(true);
    }


}
