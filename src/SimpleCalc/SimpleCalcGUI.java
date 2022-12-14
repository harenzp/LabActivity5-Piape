package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                    int n1 = Integer.parseInt(tfNumber1.getText());
                    int n2 = Integer.parseInt(tfNumber2.getText());

                    if (cbOperations.getSelectedItem().equals("+")){
                        int result = n1+n2;
                        lblResult.setText(String.valueOf(result));
                    } else if (cbOperations.getSelectedItem().equals("-")){
                        int result = n1-n2;
                        lblResult.setText(String.valueOf(result));
                    } else if (cbOperations.getSelectedItem().equals("*")){
                        int result = n1*n2;
                        lblResult.setText(String.valueOf(result));
                    } else if (cbOperations.getSelectedItem().equals("/")){
                        int result = n1/n2;
                        lblResult.setText(String.valueOf(result));
                    }


            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
