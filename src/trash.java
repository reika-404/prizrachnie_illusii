import java.awt.*;
import java.awt.event.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class trash {
    Polygon polygon = new Polygon();
    int y=30;
    int x=7;
        trash(){
            // Задаем вершины треугольника/многоугольника
            polygon.addPoint(858-x, 494-y);
            polygon.addPoint(871-x, 475-y);
            polygon.addPoint(872-x, 465-y);
            polygon.addPoint(881-x, 449-y);
            polygon.addPoint(882-x, 436-y);
            polygon.addPoint(886-x, 426-y);
            polygon.addPoint(901-x, 415-y);
            polygon.addPoint(903-x, 413-y);
            polygon.addPoint(931-x, 409-y);//поворотик
            polygon.addPoint(947-x, 414-y);
            polygon.addPoint(963-x, 419-y);
            polygon.addPoint(974-x, 429-y);
            polygon.addPoint(979-x, 439-y);;
            polygon.addPoint(979-x, 456-y);
            polygon.addPoint(987-x, 463-y);
            polygon.addPoint(1007-x, 483-y);
            polygon.addPoint(988-x, 515-y);
            polygon.addPoint(973-x, 524-y);
            polygon.addPoint(938-x, 531-y);
            polygon.addPoint(901-x, 528-y);





        }
    public boolean location1(int a, int b) {
        boolean x = polygon.contains(a, b);
        return x;
    }


}
//нахождение координаты
/* private MouseListener ll = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int a = e.getX();
            int b= e.getY();
            System.out.println(a + " " + b);


        }
    };
    public location(){
        addMouseListener(ll);
    }

    */

//линь не меняется
/* public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    if (lin.getX()+SPEED > 2000)
                    {
                        lin.setX(-60);
                    }
                    //else if (!zone.contains(lin.getX()+SPEED, lin.getY()))
                    else if (!nekto.location1(lin.getX()+SPEED, lin.getY()))
                    {
                        lin.move(SPEED,0);
                    }

                    repaint();
                }
                else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    if (lin.getX()+SPEED < -60)
                    {
                        lin.setX(2000);
                    }
                    //else if (!zone.contains(lin.getX()-SPEED, lin.getY()))
                    else if (!nekto.location1(lin.getX()-SPEED, lin.getY()))
                    {
                        lin.move(-SPEED,0);
                    }
                    repaint();
                } else if (e.getKeyCode() == KeyEvent.VK_UP)
                {
                    if (lin.getY()+SPEED <-100 )
                    {
                        lin.setY(1080);
                    }
                    //else if (!zone.contains(lin.getX(), lin.getY()-SPEED))
                    else if (!nekto.location1(lin.getX(), lin.getY()-SPEED))
                    {
                        lin.move(0,-SPEED);
                    }

                    repaint();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN)
                {

                    if (lin.getY()+SPEED > 1080 )
                    {
                        lin.setY(-100);
                    }
                    //else if (!zone.contains(lin.getX(), lin.getY()+SPEED))
                    else if (!nekto.location1(lin.getX(), lin.getY()+SPEED))
                    {
                        lin.move(0,SPEED);
                    }
                    k=1;
                    repaint();
                }
                else if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    if (!enter_clicked)
                    {
                        enter_clicked = true;
                        repaint();
                    }
                }
            }
*/
