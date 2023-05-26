package ss7_interface.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for(Shape shape : shapes){
            if(shape instanceof Circle){
                System.out.println(shape);
                Circle circle = (Circle) shape;
                System.out.println("Diện tích: "+circle.getArea());
            }
            else if(shape instanceof Rectangle){
                System.out.println(shape);
                Rectangle rectangle = (Rectangle) shape;
                rectangle.howToColor();
            }

        }
    }
}
