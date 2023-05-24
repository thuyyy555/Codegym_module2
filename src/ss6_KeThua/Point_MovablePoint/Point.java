package ss6_KeThua.Point_MovablePoint;

import ss6_KeThua.Point2D_Point3D.Point2D;

public class Point {
    float x, y;

    public Point(){};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = new float[2];
        arr[1] = this.x;
        arr[2] = this.y;
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "("+this.x+", "+this.y+")";
    }

    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point.toString());
    }
}
