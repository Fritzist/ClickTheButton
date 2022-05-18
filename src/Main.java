import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    int count = 0;
    static JLabel label;
    static JFrame frame;
    static JPanel panel;
    static JButton button;

    public void GUI() {

        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Click me");
        label = new JLabel("Number of clicks: 0                                      ");

        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 25));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click The Button");
        frame.pack();
        frame.setVisible(true);

        button.addActionListener(this);
        button.setBackground(Color.cyan);
        button.setFocusable(false);
    }

    public static void main(String[] args) {
        new Main().GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("Number of clicks: " + count);

    }
}
