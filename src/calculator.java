import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;

public class calculator {
    JFrame frame = new JFrame();
    JPanel panel;

    JTextField textField = new JTextField();
    JButton buttonNo1 = new JButton("1");
    JButton buttonNo2 = new JButton("2");
    JButton buttonNo3 = new JButton("3");
    JButton buttonNo4 = new JButton("4");
    JButton buttonNo5 = new JButton("5");
    JButton buttonNo6 = new JButton("6");
    JButton buttonNo7 = new JButton("7");
    JButton buttonNo8 = new JButton("8");
    JButton buttonNo9 = new JButton("9");
    JButton buttonNo0 = new JButton("0");

    JButton buttonEqual = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonDiv = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    JButton buttonDelete = new JButton("Delete");

    JButton buttonClear = new JButton("Clear");


    calculator(){
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        textField.setBounds(50,25,400,50);
        textField.setEditable(false);

        buttonDelete.setBounds(50,400,180,50);
        buttonClear.setBounds(270,400,180,50);

        panel = new JPanel();
        panel.setBounds(50,100,400,225);
        panel.setLayout(new GridLayout(4,4,10,10));


        panel.add(buttonNo1);
        panel.add(buttonNo2);
        panel.add(buttonNo3);
        panel.add(buttonPlus);
        panel.add(buttonNo4);
        panel.add(buttonNo5);
        panel.add(buttonNo6);
        panel.add(buttonMinus);
        panel.add(buttonNo7);
        panel.add(buttonNo8);
        panel.add(buttonNo9);
        panel.add(buttonMultiply);
        panel.add(buttonDot);
        panel.add(buttonNo0);
        panel.add(buttonEqual);
        panel.add(buttonDiv);


        frame.add(panel);
        frame.add(textField);
        frame.add(buttonDelete);
        frame.add(buttonClear);



    }
}
