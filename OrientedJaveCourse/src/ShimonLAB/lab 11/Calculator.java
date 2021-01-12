import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final JLabel result;

    private final JTextField firstNumber;
    private final JTextField secondNumber;
    private final JTextField resultText;

    private final JButton addButton;
    private final JButton clearButton;
    private final JButton exitButton;

    private final JFrame frame;

    public Calculator(){
        frame = new JFrame();
        frame.setTitle("Adder");
        frame.setSize(500,500);
        Dimension dimension = new Dimension(500, 100);
        JPanel north_jPanel = new JPanel();
        north_jPanel.setLayout(new FlowLayout());
        north_jPanel.setPreferredSize(dimension);
        JPanel south_jPanel = new JPanel();
        south_jPanel.setLayout(new FlowLayout());
        south_jPanel.setPreferredSize(dimension);
        exitButton = new JButton("Exit");
        south_jPanel.add(exitButton);
        JPanel west_jPanel = new JPanel();
        west_jPanel.setLayout(new FlowLayout());
        west_jPanel.setPreferredSize(new Dimension( 150, 500));
        JPanel east_jPanel = new JPanel();
        east_jPanel.setPreferredSize(new Dimension( 150, 500));
        east_jPanel.setLayout(new FlowLayout());
        JPanel center_jPanel = new JPanel();
        center_jPanel.setPreferredSize(new Dimension(500,200));
        center_jPanel.setBorder(BorderFactory.createLineBorder(Color.red, 4));
        JLabel number1 = new JLabel("First number: ");
        JLabel number2 = new JLabel("Second number: ");
        result = new JLabel("Result: ");
        addButton = new JButton("ADD");
        clearButton = new JButton("Clear");
        firstNumber = new JTextField(30);
        secondNumber = new JTextField(30);
        resultText = new JTextField(30);
        resultText.setEditable(false);
        center_jPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,36,30));
        center_jPanel.add(number1);
        center_jPanel.add(firstNumber);
        center_jPanel.add(number2);
        center_jPanel.add(secondNumber);
        center_jPanel.add(result);
        center_jPanel.add(resultText);
        center_jPanel.add(addButton);
        center_jPanel.add(clearButton);
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);
        frame.add(west_jPanel,BorderLayout.WEST);
        frame.add(east_jPanel, BorderLayout.EAST);
        frame.add(north_jPanel, BorderLayout.NORTH);
        frame.add(south_jPanel, BorderLayout.SOUTH);
        frame.add(center_jPanel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
    }
    //converting the test into a double
    private double convert(JTextField checkText) {
        return (Double.parseDouble(checkText.getText()));
    }
    // setting the result
    private void setText(JTextField checkText, double result) {
        checkText.setText(Double.toString(result));
    }
    //clear the texts field
    private void clear() { // clears the text box
        firstNumber.setText("");
        secondNumber.setText("");
        result.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent ea) {
        try {
            if(ea.getSource() == addButton) { // plus action
                setText(resultText,(convert(firstNumber) + convert(secondNumber)));
            }
            else if(ea.getSource() == clearButton) { // clear action
                clear();
            }
            else if(ea.getSource() == exitButton) { // exit action
                System.exit( -1 );
            }
        }
        catch(NumberFormatException e ){
            JOptionPane.showMessageDialog( frame,"wrong input,   please use numbers only!!","input error",JOptionPane.ERROR_MESSAGE);

        }
    }
    }

