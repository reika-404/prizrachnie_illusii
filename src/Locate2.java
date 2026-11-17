import java.awt.*;

public class Locate2 {


    Polygon polygon2 = new Polygon();

    private final int d_lin =12;
    Locate2(){

        //  вершины некто для бокового линьки
        polygon2.addPoint(872+d_lin, 489);
        polygon2.addPoint(851+d_lin, 464);
        polygon2.addPoint(868+d_lin, 445);
        polygon2.addPoint(866+d_lin, 435);
        polygon2.addPoint(874+d_lin, 419);
        polygon2.addPoint(875+d_lin, 406);
        polygon2.addPoint(881+d_lin, 394);
        polygon2.addPoint(894+d_lin, 385);
        polygon2.addPoint(896+d_lin, 383);
        polygon2.addPoint(924+d_lin, 379);//поворотик
        polygon2.addPoint(940+d_lin, 384);
        polygon2.addPoint(956+d_lin, 389);
        polygon2.addPoint(967+d_lin, 399);
        polygon2.addPoint(972+d_lin, 409);
        polygon2.addPoint(972+d_lin, 426);
        polygon2.addPoint(980+d_lin, 433);
        polygon2.addPoint(1000+d_lin, 453);
        polygon2.addPoint(981+d_lin, 485);
        polygon2.addPoint(966+d_lin, 494);
        polygon2.addPoint(931+d_lin, 501);
        polygon2.addPoint(890+d_lin, 498);
        polygon2.addPoint(886+d_lin, 503);





    }


    public boolean location2(int a, int b) {
        boolean x = polygon2.contains(a, b);
        return x;
    }
}



