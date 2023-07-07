package src.service;

import src.model.Booking;
import src.model.Customer;

import java.util.Scanner;

public class PromotionServiceImpl implements PromotionService{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void listCustomersUseService() {
        CustomerService customerService = new CustomerServiceImpl();
        System.out.println("======== Display list customers use  ========");
        System.out.print("Nhập năm sử dụng dịch vụ: ");
        int idCustomer = 0;
        boolean flag = false;
        int getYear = Integer.parseInt(scanner.nextLine());
        BookingService bookingService = new BookingServiceImpl();
        for(Booking booking : bookingService.getList()){
            if(getYear==booking.getEndDate().getYear()){
                idCustomer = booking.getIdCustomer();
            }
        }
        for(Customer customer : customerService.getList()){
            if(idCustomer==customer.getMaKH()){
                flag = true;
                System.out.println(customer);
            }
        }
        if(!flag){
            System.out.println("Không có khách hàng nào sử dụng dịch vụ trong năm "+getYear);
        }
    }

    @Override
    public void listCustomersGetVoucher() {

    }
}
