package src.service;

import src.model.Customer;
import src.utils.CommonUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService{
    Scanner scanner = new Scanner(System.in);
    static LinkedList<Customer> customersList = new LinkedList<>();

    static {
        customersList.add(new Customer("Trần Tường An", "12/07/1999", "Nữ", 199999999, "0934343434", "trantuongan123@gmail.com", 1001, "Diamond","Đà Nẵng"));
        customersList.add(new Customer("Võ Cao Mai Khang", "02/11/2001", "Nam", 199999989, "09356343434", "maikhang123@gmail.com", 1002, "Platinium","Gia Lai"));
        customersList.add(new Customer("Nguyễn Minh Anh", "30/04/1997", "Nam", 1999996678, "0934893434", "nguyenminhanh123@gmail.com", 1003, "Gold","Sài Gòn"));
        customersList.add(new Customer("Nguyễn Đắc Minh Nhật", "29/04/1989", "Nam", 199999659, "0934343490", "minhnhat123@gmail.com", 1004, "Silver","Hà Nội"));
        customersList.add(new Customer("Phùng Ánh Như Mai", "07/09/1993", "Nữ", 199899999, "0997343434", "phunganhnhumai123@gmail.com", 1005, "Member","Huế"));
    }

    @Override
    public void display() {
            System.out.println("-------Display list customers-------");
            System.out.println(customersList);
    }
    @Override
    public void create() {
        System.out.print("Nhap ho ten khach hang: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh khach hang: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Nhap gioi tinh khach hang: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Nhap chung minh nhan dan cua khach hang: ");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so dien thoai khach hang: ");
//        String sdt = scanner.nextLine();
        String sdt = CommonUtils.checkPhoneNumber(scanner.nextLine());
        System.out.print("Nhap email khach hang: ");
        String email = scanner.nextLine();
        System.out.print("Nhap ma khach hang: ");
        int maKH = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap loai khach hang: ");
        String loaiKhach = scanner.nextLine();
        System.out.print("Nhap dia chi khach hang: ");
        String diaChi = scanner.nextLine();
        Customer newCustomer = new Customer(hoTen, ngaySinh, gioiTinh, cmnd, sdt, email, maKH, loaiKhach, diaChi);
        customersList.add(newCustomer);
    }
    @Override
    public void update() {
        System.out.print("Nhập mã khách hàng cần chỉnh sửa thông tin: ");
        int maKH = Integer.parseInt(scanner.nextLine());
        for(Customer customer : customersList){
            if(customer.getMaKH()==maKH){
                System.out.print("Cap nhat ho ten khach hang: ");
                customer.setHoTen(scanner.nextLine());
                System.out.print("Cap nhat ngay sinh khach hang: ");
                customer.setNgaySinh(scanner.nextLine());
                System.out.print("Cap nhat gioi tinh khach hang: ");
                customer.setGioiTinh(scanner.nextLine());
                System.out.print("Cap nhat chung minh nhan dan cua khach hang: ");
                customer.setCmnd(Integer.parseInt(scanner.nextLine()));
                System.out.print("Cap nhat so dien thoai khach hang: ");
                customer.setSdt(scanner.nextLine());
                System.out.print("Cap nhat email khach hang: ");
                customer.setEmail(scanner.nextLine());
                System.out.print("Cap nhat loai khach hang: ");
                customer.setLoaiKhach(scanner.nextLine());
                System.out.print("Nhap dia chi khach hang: ");
                customer.setDiaChi(scanner.nextLine());
            }
        }
    }

    @Override
    public LinkedList<Customer> getList() {
        return customersList;
    }
}
