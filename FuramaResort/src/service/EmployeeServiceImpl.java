package src.service;

import src.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    static{
        employeeList.add(new Employee("Nguyễn Văn Tuấn Anh", "12/02/1999", "Nam", 1111111111, "0912121212", "tuananh123@gmail.com", 101, "Dai hoc", "Giam sat", 20000000));
        employeeList.add(new Employee("Nguyễn Trần Anh Tú", "07/12/1989", "Nam", 1111111112, "0912121212", "nguyentrananhtu123@gmail.com", 102, "Trung cap", "le tan", 12000000));
        employeeList.add(new Employee("Nguyễn Thị Như Nguyệt", "24/04/2000", "Nu", 1111111113, "0912121212", "nhunguyet123@gmail.com", 103, "Cao dang", "Phuc vu", 10000000));
        employeeList.add(new Employee("Trần Võ Ánh Dương", "29/08/1995", "Nu", 1111111114, "0912121212", "anhduong123@gmail.com", 104, "Sau dai hoc", "Giam doc", 50000000));
    }

    @Override
    public void display() {
            System.out.println("Display list employees");
            System.out.println(employeeList);
    }
    @Override
    public void create() {
        System.out.print("Nhap ho ten nhan vien: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh nhan vien: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Nhap gioi tinh nhan vien: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhap chung minh nhan dan cua nhan vien: ");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so dien thoai nhan vien: ");
        String sdt = scanner.nextLine();
        System.out.print("Nhap email nhan vien: ");
        String email = scanner.nextLine();
        System.out.print("Nhap ma nhan vien nhan vien: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap trinh do nhan vien: ");
        String trinhDo = scanner.nextLine();
        System.out.print("Nhap vi tri nhan vien: ");
        String viTri = scanner.nextLine();
        System.out.print("Nhap luong nhan vien: ");
        Double luong = Double.parseDouble(scanner.nextLine());
        Employee newEmployee = new Employee(hoTen, ngaySinh, gioiTinh, cmnd, sdt, email, maNhanVien, trinhDo, viTri, luong);
        employeeList.add(newEmployee);
    }
    @Override
    public void update() {
        System.out.print("Nhap ma nhan vien cua nhan vien can chinh sua thong tin: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        for(Employee employee : employeeList){
            if(employee.getMaNhanVien()==maNhanVien){
                System.out.print("Cap nhat ho ten nhan vien: ");
                employee.setHoTen(scanner.nextLine());
                System.out.print("Cap nhat ngay sinh nhan vien: ");
                employee.setNgaySinh(scanner.nextLine());
                System.out.print("Cap nhat gioi tinh nhan vien: ");
                employee.setGioiTinh(scanner.nextLine());
                System.out.print("Cap nhat chung minh nhan dan cua nhan vien: ");
                employee.setCmnd(Integer.parseInt(scanner.nextLine()));
                System.out.print("Cap nhat so dien thoai nhan vien: ");
                employee.setSdt(scanner.nextLine());
                System.out.print("Cap nhat email nhan vien: ");
                employee.setEmail(scanner.nextLine());
                System.out.print("Cap nhat trinh do nhan vien: ");
                employee.setTrinhDo(scanner.nextLine());
                System.out.print("Cap nhat vi tri nhan vien: ");
                employee.setViTri(scanner.nextLine());
                System.out.print("Cap nhat luong nhan vien: ");
                employee.setLuong(Double.parseDouble(scanner.nextLine()));
            }
        }
    }
}
