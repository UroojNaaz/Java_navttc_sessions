import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator
{
        private JPanel mainPanel;
        private JTextField num1txt;
        private JTextField num2txt;
        private JButton addBtn;
        private JButton subtractBtn;
        private JButton divisionBtn;
        private JButton multiplyBtn;
        private JButton moduleBtn;
        public Calculator()
        {
            addBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            (Integer.parseInt(num1txt.getText())+Integer.parseInt(num2txt.getText())));
                }
            });
            subtractBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            (Integer.parseInt(num1txt.getText())-Integer.parseInt(num2txt.getText())));
                }
            });
            divisionBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            (Integer.parseInt(num1txt.getText())/Integer.parseInt(num2txt.getText())));
                }
            });
            multiplyBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            (Integer.parseInt(num1txt.getText())*Integer.parseInt(num2txt.getText())));
                }
            });
            moduleBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,
                            (Integer.parseInt(num1txt.getText())%Integer.parseInt(num2txt.getText())));
                }
            });
        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainPanel);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
