import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame {

    private BufferedImage fon1;
    private BufferedImage start;
    private BufferedImage proda;
    private BufferedImage nastr;

    private BufferedImage avtor;

    private MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getX() > 131 && e.getX() < 606 && e.getY() > 239 && e.getY() < 367){
                new NeMain();
                //      setVisible(false);

            }
        }
    };

    public Main() {
        try {
            fon1 = ImageIO.read(new File("D:\\small\\inhren\\fon1.png"));
            start = ImageIO.read(new File("D:\\small\\inhren\\start.png"));
            proda = ImageIO.read(new File("D:\\small\\inhren\\proda.png"));
            nastr = ImageIO.read(new File("D:\\small\\inhren\\nastr.png"));
            avtor = ImageIO.read(new File("D:\\small\\inhren\\avtor.png"));

            setSize(2000, 1125);
            //    setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(fon1, 0, 0, null);
                    g.drawImage(start, 131, 397, null);
                    g.drawImage(proda, 131, 239, null);
                    g.drawImage(nastr, 131, 554, null);
                    g.drawImage(avtor, 131, 716, null);
                }
            };

// Добавление панели в JFrame
            add(panel);
            setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении изображения: " + e.getMessage());
        }

        //new shit
        addMouseListener(ml);
    }

    public static void main(String[] args) {
        new Main();
    }
}