import java.awt.*;

public class Locate1 {

        Polygon polygon = new Polygon();


        Locate1(){
            //  вершины некто для прямого линьки
            polygon.addPoint(872, 489);
            polygon.addPoint(851, 464);
            polygon.addPoint(868, 445);
            polygon.addPoint(866, 435);
            polygon.addPoint(874, 419);
            polygon.addPoint(875, 406);
            polygon.addPoint(881, 394);
            polygon.addPoint(894, 385);
            polygon.addPoint(896, 383);
            polygon.addPoint(924, 379);//поворотик
            polygon.addPoint(940, 384);
            polygon.addPoint(956, 389);
            polygon.addPoint(967, 399);
            polygon.addPoint(972, 409);;
            polygon.addPoint(972, 426);
            polygon.addPoint(980, 433);
            polygon.addPoint(1000, 453);
            polygon.addPoint(981, 485);
            polygon.addPoint(966, 494);
            polygon.addPoint(931, 501);
            polygon.addPoint(894, 498);
            polygon.addPoint(886, 504);





        }
        public boolean location1(int a, int b) {
            return polygon.contains(a, b);

        }

}

