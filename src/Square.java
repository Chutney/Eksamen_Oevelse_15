public class Square implements Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*width;
    }


}
