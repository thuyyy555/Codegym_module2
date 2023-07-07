package src.repository;

import src.model.Booking;

import java.util.LinkedList;

public interface IBookingRepository {
    LinkedList<Booking> findAll();
    public int getSize();
//    public int addSize();
}
