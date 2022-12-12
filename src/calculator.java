import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class calculator implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel;

    JButton[] numberButton = new JButton [10];
    JButton[] functionButton = new JButton [8];

    JTextField textField = new JTextField();


    JButton buttonEqual = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonDiv = new JButton("/");
    JButton buttonMultiply = new JButton("*");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");

    JButton buttonDelete = new JButton("Delete");

    JButton buttonClear = new JButton("Clear");

    Double FirstNumber, SecondNumber, result;
    String operator;


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


        for (int i = 0; i<10 ; i++){

            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFocusable(false);


        }

        functionButton[0] = buttonPlus ;

        functionButton[1] = buttonMinus;

        functionButton[2] = buttonMultiply;

        functionButton[3] = buttonDot;

        functionButton[4] = buttonEqual;

        functionButton[5] = buttonDiv;

        functionButton[6] = buttonDelete;
        functionButton[7] = buttonClear;



        for(int i= 0 ; i<8 ; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFocusable(false);

        }


        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add( functionButton[0]);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add( functionButton[1]);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add( functionButton[2]);
        panel.add( functionButton[3]);
        panel.add(numberButton[0]);
        panel.add( functionButton[4]);
        panel.add( functionButton[5]);


        frame.add(panel);
        frame.add(textField);
        frame.add( functionButton[6]);
        frame.add( functionButton[7]);





    }

    @Override
    public void actionPerformed(ActionEvent e) {


        for( int i = 0; i<10; i++) {
            if (e.getSource() == numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == buttonClear){
            textField.setText("");
        }


        if (e.getSource() == buttonDelete){
            String s = textField.getText();
            textField.setText("");
            for (int i = 0; i < s.length()-1; i++){
                textField.setText(textField.getText() + s.charAt(i));
            }
        }

        if(e.getSource() == buttonDot){
            if(!textField.getText().contains(".")){
                textField.setText(textField.getText().concat("."));
            }
        }

        if(e.getSource() == buttonPlus){
            FirstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
             operator = "+";

        }

        if(e.getSource() == buttonMinus){
            FirstNumber  = Double.parseDouble(textField.getText());
            textField.setText("");
             operator = "-";

        }

        if(e.getSource() == buttonMultiply){
             FirstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
             operator = "*";

        }



        if(e.getSource() == buttonDiv){
             FirstNumber = Double.parseDouble(textField.getText());
            textField.setText("");
             operator = "/";

        }

        if (e.getSource() == buttonEqual) {
            SecondNumber = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    result = FirstNumber + SecondNumber;
                    break;


                case "-":
                    result = FirstNumber - SecondNumber;
                    break;


                case "/":
                    result = FirstNumber / SecondNumber;
                    break;


                case "*":
                    result = FirstNumber * SecondNumber;
                    break;

            }

            textField.setText(String.valueOf(result));
            FirstNumber = result;
        }



        }





    }

