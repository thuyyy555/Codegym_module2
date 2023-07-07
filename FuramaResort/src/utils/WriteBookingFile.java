package src.utils;

import src.model.Booking;
import src.service.BookingService;
import src.service.BookingServiceImpl;
import sun.awt.image.ImageWatched;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteBookingFile {
    private static final String PATH = "C:\\Users\\ASUS\\OneDrive\\Tài liệu\\CodeGym\\module2\\Codegym_module2\\FuramaResort\\src\\data\\booking.csv";
    static BookingService bookingService = new BookingServiceImpl();
    static LinkedList<Booking> bookings = bookingService.getList();

    public static LinkedList<Booking> writeFile(){
        File file = new File(PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Booking booking : bookings){
                bufferedWriter.write(booking.getIdBooking() +"," +booking.getStartDate()+","+booking.getEndDate()+","+booking.getIdFacility()+","+booking.getIdCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookings;
    }
}
