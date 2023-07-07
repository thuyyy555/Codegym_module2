package src.repository;

import src.model.Booking;
import src.utils.ReadBookingFile;

import java.util.LinkedList;

public class BookingRepository implements IBookingRepository{
    static LinkedList<Booking> getBookingList = new LinkedList<>();
    public  LinkedList<Booking> findAll() {
        return getBookingList= ReadBookingFile.readFile();
    }
    @Override
    public int getSize() {
        return ReadBookingFile.readFile().size();
    }
}
