import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp {
    private JFrame frame;
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public CalculatorApp() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Center the window on the screen

        // Create the text field for displaying the input/result
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.PLAIN, 30));  // Set font size
        textField.setHorizontalAlignment(JTextField.RIGHT);   // Align text to the right
        frame.add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));  // Add spacing between buttons
        panel.setBackground(Color.lightGray);  // Set background color of the panel

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));  // Set button font size
            button.setFocusPainted(false);  // Remove focus outline
            button.setBackground(new Color(211, 211, 211));  // Light gray button color
            button.setPreferredSize(new Dimension(80, 80));  // Set button size
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String command = source.getText();

            if (command.equals("=")) {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
                operator = null;
            } else if (command.equals("/") || command.equals("*") || command.equals("-") || command.equals("+")) {
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            } else {
                textField.setText(textField.getText() + command);
            }
        }
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorApp calculator = new CalculatorApp();
            calculator.show();
        });
    }
}
