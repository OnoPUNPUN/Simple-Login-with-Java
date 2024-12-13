import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class WelcomePage {
    
    WelcomePage()
    {
        JFrame frame = new JFrame();
        JLabel label = new JLabel(); // create a label
        Border border = BorderFactory.createLineBorder(Color.MAGENTA, 3);
        ImageIcon image = new ImageIcon("pngegg.png");
        label.setText("World Of PUNPUN"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.GRAY); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // Set Font of Text
        label.setIconTextGap(-10); // set gap of text to image
        label.setBackground(Color.BLACK); // set BackGround color
        label.setOpaque(true); // set Background Color
        label.setVerticalAlignment(JLabel.CENTER); // set vertical Position of Icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal postion of Icon + text within label
        label.setBounds(100, 100, 250, 250);
        label.setBorder(border);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("WORLD OF PUNPUN");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
    }
}
