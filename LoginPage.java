import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdFiled = new JTextField();
    JPasswordField userPasswordFiled = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messagelabel = new JLabel();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messagelabel.setBounds(125, 250, 250, 35);
        messagelabel.setFont(new Font(null, Font.ITALIC, 25));

        userIdFiled.setBounds(125, 100, 200, 25);
        userPasswordFiled.setBounds(125, 150, 200, 25);

        // Login button settings
        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        // Reset Button settings
        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // adding Componete
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(userIdFiled);
        frame.add(userPasswordFiled);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messagelabel);

        // Frame Settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIdFiled.setText("");
            userPasswordFiled.setText("");
        }

        if (e.getSource() == loginButton) {
            String userId = userIdFiled.getText();
            String passwrod = String.valueOf(userPasswordFiled.getPassword());

            if (loginInfo.containsKey(userId)) {
                if (loginInfo.get(userId).equals(passwrod)) {
                    messagelabel.setForeground(Color.green);
                    messagelabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage();
                } else {
                    messagelabel.setForeground(Color.red);
                    messagelabel.setText("Wrong password");
                }
            } else {
                messagelabel.setForeground(Color.red);
                messagelabel.setText("Username not Found");
            }
        }
    }
}
