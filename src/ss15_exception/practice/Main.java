package ss15_exception.practice;

public class Main {
    public static void main(String[] args) {
        try{
            checkTriangle(2, 3, 4);
        }
        catch(IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
    static boolean checkTriangle(int a, int b, int c) throws  IllegalTriangleException{
        if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("Giá trị nhập vào là số âm!");
        }
        if(!((a+b)>c)||!((a+c)>b)||!((b+c)>a)){
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại!");
        }
        return true;

    }
}
