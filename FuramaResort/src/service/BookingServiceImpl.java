package src.service;

import src.model.Booking;
import src.repository.BookingRepository;
import src.utils.CommonUtils;
import src.utils.ReadBookingFile;
import src.utils.WriteBookingFile;

import java.time.LocalDate;
import java.util.*;

public class BookingServiceImpl implements BookingService {
    Scanner scanner = new Scanner(System.in);
    //    Set<Booking> listBooking = new TreeSet<>();
//    static LinkedList<Booking> listBooking = new LinkedList<>();
    static LinkedList<Booking> bookingsList = ReadBookingFile.readFile();
//    public void getBookingFromFile(){
//        for(Booking booking : ReadBookingFile.readFile()){
//            bookingsList.add(booking);
//        }
//    }

//    static{
//        listBooking.add(new Booking(1, LocalDate.parse("2023-06-15"), LocalDate.parse("2024-06-25"), "Villa01", 1001));
//        listBooking.add(new Booking(2, LocalDate.parse("2023-06-18"), LocalDate.parse("2024-06-30"), "Villa01", 1002));
//        listBooking.add(new Booking(3, LocalDate.parse("2023-06-17"), LocalDate.parse("2024-06-30"), "Room01", 1003));
//        listBooking.add(new Booking(4, LocalDate.parse("2023-06-15"), LocalDate.parse("2024-06-26"), "Room02", 1004));
//
//    }


    @Override
    public void addNewBooking() {
        BookingRepository bookingRepository = new BookingRepository();
        System.out.println("-------Add New Booking-------");
        CustomerService customerService = new CustomerServiceImpl();
        customerService.display();
        System.out.print("Nhập mã khách hàng: ");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        FacilityService facilityService = new FacilityServiceImpl();
        facilityService.displayListFacility();
        System.out.print("Nhập tên dịch vụ: ");
        String idFacility = scanner.nextLine();
        LocalDate startDate = LocalDate.now();
        System.out.print("Nhập ngày kết thúc: ");
        String value = scanner.nextLine();
        LocalDate endDate = CommonUtils.getDate(value);
        Booking newBooking = new Booking(bookingRepository.getSize()+1, startDate, endDate, idFacility, idCustomer);
        boolean flag = true;
        for (Booking booking : bookingsList) {
            if (newBooking.equals(booking)) {
                System.out.println("Thông tin BOOKING trùng lặp!!!");
                flag = false;
            }
        }
        getList();
        if (flag) {
            bookingsList.add(newBooking);
            facilityService.increase(idFacility);
        }
        WriteBookingFile.writeFile();
    }

    @Override
    public void displayListBooking() {
        Collections.sort(bookingsList);
        System.out.println("--------Display List Booking-------");
        for (Booking element : bookingsList) {
            System.out.println(element);
        }
    }

    @Override
    public LinkedList<Booking> getList() {
        return bookingsList;
    }

}
