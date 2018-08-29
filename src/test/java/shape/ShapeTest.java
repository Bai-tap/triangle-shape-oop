package shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape.toString());

        Triangle triangle = new Triangle("red", true, 3, 5, 7);
        System.out.println(triangle.toString());
    }
}