package FactoryPattern;

public class FatoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();
        Shape square= factory.getShape("SQUARE");
        square.draw();

    }
}
