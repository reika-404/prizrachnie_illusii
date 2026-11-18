import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Nekto extends JPanel {
    private boolean enter_clicked = false;
    private final int SPEED = 5;
    private final int necto_width = 108;
    private final int necto_height =116;
    private final int necto_minx=900;
    private final int necto_miny = 500;

    private Lin1 lin = new Lin1(900,963-30 );
    private Locate1 l1 = new Locate1();
    private Locate2 l2 = new Locate2();
    Rectangle zone = new Rectangle(898,535,60,109);
    private BufferedImage nekto_2mae,fon3, fon2;
    private int poza =0;



    private KeyListener kl = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT )
            {
                if (lin.getX()+SPEED > 2000   )
                {
                    lin.setX(-60);
                }

                else if (!l2.location2(lin.getX()+SPEED, lin.getY()) && poza ==2)
                {
                    lin.move(SPEED,0);
                }
                if(poza !=2 && poza !=3){lin.setX(lin.getX()+13);}
                poza =2;
                repaint();
            }
            else if (e.getKeyCode() == KeyEvent.VK_LEFT )
            {
                if (lin.getX()+SPEED < -60  )
                {
                    lin.setX(2000);
                }

                else if (!l2.location2(lin.getX()-SPEED, lin.getY()) && poza ==3)
                {
                    lin.move(-SPEED,0);
                }
                else
                {
                    System.out.println(lin.getX() + " " + lin.getY());
                }
                if(poza !=2 && poza !=3){lin.setX(lin.getX()+13);}
                poza =3;
                repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                if (lin.getY()+SPEED <-100  )
                {
                    lin.setY(1080);
                }

                else if (!l1.location1(lin.getX(), lin.getY()-SPEED) && poza ==0)
                {
                    lin.move(0,-SPEED);
                }
                if(poza !=0 && poza !=1){lin.setX(lin.getX()-13);}
                poza =0;
                repaint();
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {

                if (lin.getY()+SPEED > 1080 )
                {
                    lin.setY(-100);
                }

                else if (!l1.location1(lin.getX(), lin.getY()+SPEED) && poza ==1)
                {
                    lin.move(0,SPEED);
                }
                if(poza !=0 && poza !=1){lin.setX(lin.getX()-13);}
                poza =1;
                repaint();
            }

            else if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                if (!enter_clicked) // фон 2
                {
                    enter_clicked = true;
                    repaint();
                }


            }
        }
    };

    public Nekto() throws IOException {
        nekto_2mae = ImageIO.read(new File("src\\inhren\\nekto_2mae.png"));
        fon3 = ImageIO.read(new File("src\\inhren\\fon3.png"));
        fon2 = ImageIO.read(new File("src\\inhren\\fon2.png"));

        setFocusable(true);// может принять фокус

        addKeyListener(kl);

        addComponentListener(new ComponentAdapter() { //когда показывается панелька, на нее переводится фокус
            @Override
            public void componentShown(ComponentEvent e) {
                e.getComponent().requestFocusInWindow();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (enter_clicked)
        {
            g.drawImage(fon3, 0, 0,  null);
            g.drawImage(nekto_2mae, necto_minx, necto_miny, necto_width, necto_height, null);
            if (poza ==0)g.drawImage(lin.getLin_2ushi() , lin.getX(), lin.getY(), null);
            if (poza ==1)g.drawImage(lin.getLin_2mae() , lin.getX(), lin.getY(), null);
            if (poza ==2)g.drawImage(lin.getLin_2migi() , lin.getX(), lin.getY(), null);
            if (poza ==3)g.drawImage(lin.getLin_2hida() , lin.getX(), lin.getY(), null);

        }
        else
        {
            g.drawImage(fon2, 0, 0, 1920,1080, null);
        }
    }

};

