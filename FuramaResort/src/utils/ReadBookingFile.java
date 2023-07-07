package src.utils;

import src.model.Booking;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadBookingFile {
    private static final String PATH = "C:\\Users\\ASUS\\OneDrive\\Tài liệu\\CodeGym\\module2\\Codegym_module2\\FuramaResort\\src\\data\\booking.csv";

//    public static LinkedList<Booking> bookingsList = new LinkedList<Booking>();

    public static LinkedList<Booking> readFile() {
        LinkedList<Booking> bookingsList = new LinkedList<Booking>();
        File file = new File(PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                Booking booking = new Booking();
                String[] strings = line.split(",");
                booking.setIdBooking(Integer.parseInt(strings[0]));
                booking.setStartDate(LocalDate.parse(strings[1]));
                booking.setEndDate(LocalDate.parse(strings[2]));
                booking.setIdFacility(strings[3]);
                booking.setIdCustomer(Integer.parseInt(strings[4]));
                bookingsList.add(booking);
//                System.out.println(booking);
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookingsList;
    }
}
