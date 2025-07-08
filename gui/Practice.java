import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Practice {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        ImageIcon youtubeIcon = new ImageIcon("../assets/youtube-icon.png");
        JButton button = new JButton("GET STARTED");
        JLabel label = new JLabel("Welcome to Youtube! Create & Influence!");

        label.setForeground(Color.WHITE);
        label.setBounds(-10, 140, 600, 50);
        label.setFont(new Font("Poppins", Font.PLAIN, 16));
        label.setHorizontalAlignment(JLabel.CENTER);

        button.setBounds(190, 200, 200, 50);
        button.setFont(new Font("Poppins", Font.PLAIN, 16));
        button.setFocusable(false);
        button.setBackground(new Color(0x1f1f1f));
        button.setForeground(new Color(0xffffff));
        button.setBorder(null);

        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Youtube Java");
        window.setIconImage(youtubeIcon.getImage());
        window.getContentPane().setBackground(new Color(0x111111));
        window.setLocation(540, 100);
        window.setLayout(null);
        window.setVisible(true);
        window.add(button);
        window.add(label);
    }
}