package ss5_accessModifier_staticMethod;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){}

    public Circle(double r){
        this.radius=r;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    public static void main(String[] args) {

    }
}
