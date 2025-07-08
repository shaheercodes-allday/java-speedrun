import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Practice {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        ImageIcon youtubeIcon = new ImageIcon("../assets/youtube-icon.png");
        JLabel label = new JLabel("Welcome to Youtube!");
        Border border = BorderFactory.createLineBorder(Color.darkGray, 3);

        label.setForeground(new Color(0xe5e5e5));
        label.setFont(new Font("Poppins", Font.PLAIN, 20));
        label.setIcon(youtubeIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);

        window.setSize(600, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Youtube Java");
        window.setIconImage(youtubeIcon.getImage());
        window.getContentPane().setBackground(new Color(0x111111));
        window.setLocation(540, 100);
        window.setVisible(true);
        window.add(label);
    }
}