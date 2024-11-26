import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FireApp {
    public static FireApp app;
    public JFrame frame;
    public JLabel label;

    public static void main(String[] args) {
        app = new FireApp();
    }

    public FireApp() {
        frame = new JFrame("Frame Title");
        frame.setSize(640, 480);

        label = new JLabel("Hello, World!");
        label.setSize(640, 480);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.setVisible(true);

        try {
            for (int i = 0; i < 10; i++) {
                label.setText(String.format("%d", i));
                switch (i % 3) {
                    case 0:
                        label.setBackground(Color.RED);
                        break;
                    case 1:
                        label.setBackground(Color.GREEN);
                        break;
                    case 2:
                        label.setBackground(Color.BLUE);
                        break;
                }
                Thread.sleep(1000);
            }
            label.setText("Fire!!");
            Color color = new Color(0.4f, 0.8f, 0.1f);
            label.setBackground(color);
        } catch (InterruptedException e) {
        }
    }
}
