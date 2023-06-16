package ss6_inheritance.Point2D_Point3D;

public class Point2D extends Object{
    float x, y;

    public Point2D(){};

    public Point2D(float x, float y) {
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
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D.toString());
    }
}
