package ss6_KeThua.Point2D_Point3D;

public class Point3D extends Point2D{
    float z;
    public Point3D(){};

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[1] = this.x;
        arr[2] = this.y;
        arr[3] = this.z;
        return arr;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return "("+this.x+", "+this.y+", "+this.z+")";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D.toString());
    }

}
