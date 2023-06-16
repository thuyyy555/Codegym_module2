package ss6_inheritance.Point_MovablePoint;

public class MovablePoint extends Point {
    float xSpeed, ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[1] = this.xSpeed;
        arr[2] = this.ySpeed;
        return arr;
    }
    public String toString(){
        return "("+this.x+", "+this.y+"), speed = ("+this.xSpeed+", "+this.ySpeed+")";
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint.toString());
    }
}
