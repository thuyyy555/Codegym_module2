package ss4_lop_doi_tuong_java;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    double a, b, c;
    PhuongTrinhBacHai(){}

    PhuongTrinhBacHai(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double getDiscriminant(){
        double delta;
        delta = this.b*this.b-4*this.a*this.c;
        return delta;
    }

    double getRoot1(){
        double r1= (-this.b + Math.sqrt((this.b*this.b)-4*this.a*this.c))/(2*this.a);
        return r1;
    }

    double getRoot2(){
        double r2= (-this.b - Math.sqrt((this.b*this.b)-4*this.a*this.c))/(2*this.a);
        return r2;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhuongTrinhBacHai pt= new PhuongTrinhBacHai();
        System.out.print("Nhập a: ");
        pt.a= Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b: ");
        pt.b= Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        pt.c= Double.parseDouble(scanner.nextLine());
        if(pt.getDiscriminant()>=0){
            System.out.println("Nghiệm 1 của phương trình: "+pt.getRoot1());
            System.out.println("Nghiệm 2 của phương trình: "+pt.getRoot2());
        }
        else if(pt.getDiscriminant()==0){
            System.out.println("Nghiệm của phương trình: "+pt.getRoot1());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
