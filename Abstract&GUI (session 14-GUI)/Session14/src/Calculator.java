import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel mainPanel;
    private JTextField txtnum1;
    private JTextField txtnum2;
    private JButton btnadd;
    private JButton btnsub;
    private JButton btnmul;
    private JButton btndiv;
    private JButton btnmod;
    public Calculator() {
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        (Integer.parseInt(txtnum1.getText())+Integer.parseInt(txtnum2.getText())));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainPanel);

        frame.setVisible(true);
    }
}
