import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Lin1 {
    private BufferedImage lin_2ushi,lin_2mae, lin_2migi, lin_2hida ;
    private int x,y;
    public final int lin_width = 58;
    public final int lin_height = 118;
    public final int lin_bok_width = 32;


    Lin1(int x_, int y_) throws IOException {
        lin_2ushi = ImageIO.read(new File("src\\inhren\\lin_2ushi.png"));
        lin_2mae = ImageIO.read(new File("src\\inhren\\lin_2mae.png"));
        lin_2migi = ImageIO.read(new File("src\\inhren\\lin_2migi.png"));
        lin_2hida = ImageIO.read(new File("src\\inhren\\lin_2hida.png"));

        x = x_;
        y = y_;
    }

    void move(int delta_x, int delta_y)
    {
        y+=delta_y;
        x+=delta_x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x_) {
        x = x_;
    }

    public void setY(int y_) {
        y = y_;
    }

    public BufferedImage getLin_2ushi() {
        return lin_2ushi;
    }
    public BufferedImage getLin_2mae() {
        return lin_2mae;
    }
    public BufferedImage getLin_2migi() {
        return lin_2migi;
    }
    public BufferedImage getLin_2hida() {
        return lin_2hida;
    }
}
