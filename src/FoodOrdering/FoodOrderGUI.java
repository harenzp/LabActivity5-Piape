package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    ButtonGroup G = new ButtonGroup();


    public FoodOrderGUI() {

        G.add(rbNone);
        G.add(rb5);
        G.add(rb10);
        G.add(rb15);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total=0;
                double discount;

                if (cPizza.isSelected()){
                    total += 100;
                }
                if (cBurger.isSelected()){
                    total += 80;
                }
                if (cFries.isSelected()){
                    total += 65;
                }
                if (cSoftDrinks.isSelected()){
                    total += 55;
                }
                if (cTea.isSelected()){
                    total += 50;
                }
                if (cSundae.isSelected()){
                    total += 40;
                }

                if (rb5.isSelected()){
                    discount = total*0.05;
                    total -= discount;
                } else if (rb10.isSelected()){
                    discount = total*0.10;
                    total -= discount;
                } else if (rb15.isSelected()){
                    discount = total*0.15;
                    total -= discount;
                }

                JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {

        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(600, 600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
