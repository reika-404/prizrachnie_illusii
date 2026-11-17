import javax.swing.*;
import java.awt.event.*;
import java.awt.CardLayout;
import java.io.IOException;

public class Game extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel locations;

    private MouseListener vl = new MouseAdapter() {  // location
        @Override
        public void mouseClicked(MouseEvent e) {
            int a = e.getX();
            int b= e.getY();
            System.out.println(a + " " + b);

        }
    };

    public Game() {
        try {
            setSize(1920, 1180);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            locations = new JPanel(cardLayout);
            locations.add("Nekto", new Nekto());
            cardLayout.show(locations, "Nekto");
            add(locations);
            setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении изображения4: " + e.getMessage());
        }
        addMouseListener(vl);
    }

}


