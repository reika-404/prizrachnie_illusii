import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NeMain extends JFrame {

    private BufferedImage lin_mae;

    public NeMain() {
        try {

            lin_mae = ImageIO.read(new File("D:\\small\\inhren\\lin_mae.png"));


            setSize(80, 120);
            setVisible(true);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    g.drawImage(lin_mae, 20, 0, null);

                }
            };

// Добавление панели в JFrame
            add(panel);
            setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении изображения: " + e.getMessage());
        }

    }
}

