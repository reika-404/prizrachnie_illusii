import javax.swing.*;
import java.awt.event.*;
import java.awt.CardLayout;
import java.io.IOException;

public class Game extends JFrame {
    private final CardLayout cardLayout = new CardLayout();// менджер компановки (переключение между панельками)
    private final JPanel locations; //панелька в Game на которую кладутся остальные панельки

    private MouseListener vl = new MouseAdapter() {  // location
        @Override
        public void mouseClicked(MouseEvent e) {
            int a = e.getX();
            int b= e.getY();
            System.out.println(a + " " + b);

        }
    };

    public Game() {
            setSize(1920, 1180);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            locations = new JPanel(cardLayout); // чтобы на locations были все панели локаций, но в каждый момент была только одна
        try {
            locations.add("Nekto", new Nekto()); //добавление локации Некто
            cardLayout.show(locations, "Nekto"); //показывает нужную панельку
            add(locations);
            setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении изображения4: " + e.getMessage());
        }
        addMouseListener(vl);
    }

}


