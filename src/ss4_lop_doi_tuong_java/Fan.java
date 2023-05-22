package ss4_lop_doi_tuong_java;

public class Fan {
    public static final int SLOW=1, MEDIUM=2, FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    void toStringInfor(){
        if(this.on){
            System.out.println(getSpeed()+", "+getColor()+", "+getRadius()+", fan is on");
        }
        else {
            System.out.println(getColor()+", "+getRadius()+", fan is off");
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
        fan1.toStringInfor();
        fan2.toStringInfor();
    }
}
