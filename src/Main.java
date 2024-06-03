import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rn = new Random();

        ArrayList<Shape> listOfShapes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if(rn.nextInt(0,2) == 1) {
                listOfShapes.add(new Circle(rn.nextDouble(0,100)));
            } else {
                listOfShapes.add(new Square(rn.nextDouble(0,100)));
            }

            System.out.println(listOfShapes.get(i).getArea());
        }





    }

}
